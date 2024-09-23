package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestExamples {
	
	@Test
	public void test_1(){
		Response response =  RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.getTime());
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
	}
	
	public void test2() {
		Response newResponse =  RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(newResponse);
	}
}
