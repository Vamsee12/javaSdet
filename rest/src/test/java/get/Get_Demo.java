package get;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
//import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Demo {
	
	
	@Test
	void getDemo() {
		
		//Response response=RestAssured.get("https://reqres.in/api/users?page=2");
		
		Response response=get("https://reqres.in/api/users?page=2");
		//static implementation ,without object
		
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.contentType());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.time());
		
	}
	
	@Test
	void staticRun() {
		//given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
		given().get("https://reqres.in/api/users?page=2").then().statusCode(201);
		
	}

}
