package DataDrivenTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DataDrivenwithjson {
	@Test
	public void sendpostRequest() {
		// Provide the json file Path address
		String jsonFilePath="C:\\Users\\Mahesh\\Desktop\\API_Automation\\testdata1.json";
		//read the data from json file
		String jsonData ="";
		//To send Request the request and capture the response
		Response response=RestAssured.given()
				.contentType(ContentType.JSON)
				.body(jsonData)
				.when()
				.post("https://reqres.in/api/users");
		      // Printing the response and status code
		    String ResponseBody=response.getBody().asString();
		    int statuscode =response.getStatusCode();
		    //Add assertions
		    
		    //Print the response and status code
		    System.out.println("status code:"+statuscode);
		    System.out.println("Response body:"+ResponseBody);
				
				
		
		
		
		
	}

}
