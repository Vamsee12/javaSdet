package rest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	@Test
	public void getWeatherDetails() {

		// Specify the base URL
		RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";

		// Request Object
		RequestSpecification httpRequest = RestAssured.given();

		// Response Object
		Response response = httpRequest.request(Method.GET, "/Hyderabad");

		// Print response in console window
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is ==  " + responseBody);

		// status code validation
		int statusCode = response.getStatusCode();
		System.out.println("statusCode is" + statusCode);
		Assert.assertEquals(statusCode, 200);

		// status line validation
		String statusLine = response.getStatusLine();
		System.out.println("statusLine is" + statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	}

}
