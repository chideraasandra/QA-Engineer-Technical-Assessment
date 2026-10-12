# QA-Engineer-Technical-Assessment
This assessment covers exploratory testing, UI automation, and API testing using SauceDemo.

## Prerequisites

- Java JDK 17
- Eclipse IDE (recommended)
- Maven project dependencies configured in `pom.xml`
- Postman for API testing

## UI Automation

The UI automation tests were implemented using Selenium WebDriver, Java, TestNG, and Maven.

### Running the Tests

1. Clone or download this repository.
2. Import the project into Eclipse as an existing Java project.
3. Allow Eclipse to resolve the Maven dependencies.
4. Open `testng.xml` and run it as a TestNG Suite.

## API Testing

The Postman collection is included in the repository. Import the collection JSON file into Postman, open the relevant requests in the **User** folder, and execute them to review the response status, response body, response time, and test results.

API testing covered user creation, retrieval, updating, and deletion using the Swagger Petstore API.

## Exploratory Testing: Test Cases and Bug Reports

The exploratory test cases, execution results, and identified defects are documented in the test case and bug report workbook linked in the assessment submission. They can also be viewed [here](Exploratory_Testing_Report.pdf).

## Framework Note

Selenium with Java and TestNG was used for UI automation because these are the tools I have practical experience with. Playwright and Cypress were not used for this assessment.
