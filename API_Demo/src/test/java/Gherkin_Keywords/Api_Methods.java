package Gherkin_Keywords;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import io.restassured.response.Response;

public class Api_Methods {

    // To set base URI before all tests/methods
    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://reqres.in/api";
    }

    @Test
    public void postRequest() {
        // To initiate the Payload/request payload
        String requestBody = "{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}";

        // To specify the default data/data format, header, body, auth
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                // To send the request
                .when()
                .post("/users")
                // To capture the response
                .then()
                .extract().response();

        // Response Validations/Assertions
        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertEquals(response.jsonPath().getString("name"), "morpheus");
        Assert.assertEquals(response.jsonPath().getString("job"), "leader");

        // Print response body
        System.out.println("ResponseBody:" + response.getBody().asString());
    }
}
