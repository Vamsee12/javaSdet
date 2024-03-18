package rest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutOperationDemo {
 
	@Test
	void regestrationSuccessful() {
		
		RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";

		// Request Object
		RequestSpecification httpRequest = RestAssured.given();
		
		JSONObject requestParams = new JSONObject();
		
		requestParams.put("FirstName", "Vamsee");
		requestParams.put("LastName", "Mohan");
		requestParams.put("UserName", "VmcMahi12");
		requestParams.put("Email", "Vamsee123@gmail.com");
		requestParams.put("Password", "Vamsee@123");
		
		httpRequest.header("Content-Type", "application/json");

		// Response Object
		Response response = httpRequest.request(Method.GET, "/Hyderabad");

		
	}
}
