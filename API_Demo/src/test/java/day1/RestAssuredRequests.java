package day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredRequests{
	@Test
	public void createResource()
	{
		//To Intiate the payload
		String RequestBody="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		//To specify the input data format or pay load format
		RequestSpecification request =RestAssured.given();
		request.header("contentType","application/json");
		request.body(RequestBody);
		//To send the request and to capture the response, to store the response in a variable
		Response response=request.post("https://reqres.in/api/users");
		// TO Print the response and status codeint 
		int statuscode=response.getStatusCode();
		System.out.println("statusCode:"+statuscode);
		String responseBody=response.getBody().asString();
		System.out.println("ResponseBody:"+responseBody);
		
	}			
}


