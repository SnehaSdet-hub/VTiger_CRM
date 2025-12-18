# VTiger CRM – SDET Automation Framework

## 📌 Project Overview
This project is an **End-to-End Test Automation Framework** built for the **VTiger CRM web application**.  
The framework is designed using **SDET best practices** to automate **UI workflows**, **API validations**, and **database checks**, ensuring high product quality and faster regression cycles.

---

## 🧠 Objectives
- Automate critical CRM workflows using Selenium WebDriver
- Validate backend services using REST Assured
- Perform database validation using SQL
- Support scalable, maintainable, and reusable automation
- Integrate automation with CI/CD pipelines

---

## 🛠️ Tech Stack
- **Language:** Java  
- **UI Automation:** Selenium WebDriver  
- **Test Framework:** TestNG  
- **API Automation:** REST Assured, Postman  
- **Build Tool:** Maven  
- **CI/CD:** Jenkins  
- **Database:** SQL  
- **Design Pattern:** Page Object Model (POM)  
- **Version Control:** Git & GitHub  

---

## 📂 Project Structure
VTiger_CRM
├── src
│ ├── test
│ │ ├── java
│ │ │ ├── base # Base classes (WebDriver, setup)
│ │ │ ├── pages # Page Object classes
│ │ │ ├── utils # Utilities (config, waits, DB, listeners)
│ │ │ └── tests # Test classes
│ │ └── resources
│ │ ├── config.properties
│ │ └── testng.xml
├── pom.xml
└── README.md


---

## 🧪 Test Coverage

### ✅ UI Automation
- Login functionality
- Create / Update / Delete CRM entities
- End-to-End user workflows
- Validation of UI elements and messages

### ✅ API Automation
- REST API testing using REST Assured
- CRUD operations (POST, GET, PUT, DELETE)
- Request chaining and response validation
- Authentication handling

### ✅ Database Validation
- Data validation after API/UI operations
- SQL queries to verify insert/update/delete actions

---

## ▶️ How to Run the Tests

### Prerequisites
- Java 11+
- Maven
- IDE (IntelliJ / Eclipse)
- Chrome Browser

### Steps
```bash
git clone https://github.com/SnehaSdet-hub/VTiger_CRM.git
cd VTiger_CRM
mvn clean test

CI/CD Integration
-----------------

Automation tests are integrated with Jenkins

Supports scheduled and on-demand execution

Generates automated execution reports

Reporting
---------

TestNG execution reports

Failure screenshots captured automatically

Logs for debugging failed test cases

Key Highlights
--------------

Hybrid automation framework (UI + API + DB)

Page Object Model for better maintainability

Data-driven and parallel execution using TestNG

CI/CD ready automation suite

Author
------
Sneha M Y
SDET / Java Automation Engineer
