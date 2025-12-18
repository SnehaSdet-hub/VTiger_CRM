package api;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class CreateContactAPITest {

    @Test
    public void createContactTest() {

        String payload = "{\n" +
                "  \"lastname\": \"Sneha\",\n" +
                "  \"email\": \"sneha@test.com\"\n" +
                "}";

        Response response =
                given()
                    .baseUri("http://localhost:8888")
                    .basePath("/api/contacts")
                    .contentType(ContentType.JSON)
                    .body(payload)
                .when()
                    .post()
                .then()
                    .statusCode(201)
                    .body("lastname", equalTo("Sneha"))
                    .extract().response();

        int contactId = response.jsonPath().getInt("id");
        System.out.println("Created Contact ID: " + contactId);
    }
}
