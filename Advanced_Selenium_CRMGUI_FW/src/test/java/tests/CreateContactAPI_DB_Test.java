package tests;

import api.CreateContactAPITest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DBUtils;

import java.sql.ResultSet;

import static io.restassured.RestAssured.*;

public class CreateContactAPI_DB_Test {

    @Test
    public void validateContactInDB() throws Exception {

        // Step 1: Create contact via API
        int contactId =
                given()
                    .baseUri("http://localhost:8888")
                    .contentType("application/json")
                    .body("{\"lastname\":\"Sneha\"}")
                .when()
                    .post("/api/contacts")
                .then()
                    .statusCode(201)
                    .extract()
                    .jsonPath()
                    .getInt("id");

        // Step 2: Validate in DB
        ResultSet rs = DBUtils.executeQuery(
                "SELECT lastname FROM contacts WHERE id=" + contactId
        );

        Assert.assertTrue(rs.next());
        Assert.assertEquals(rs.getString("lastname"), "Sneha");
    }
}
