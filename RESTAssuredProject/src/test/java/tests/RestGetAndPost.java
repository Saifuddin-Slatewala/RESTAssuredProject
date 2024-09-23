package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class RestGetAndPost {

	//@Test
	public void restGet() {
		
		baseURI = "http://localhost:3000";
		
		given().get("/Users").then().statusCode(200).log().all();
		
	}
	
	@Test
	public void restPost() {
		
	JSONObject request = new JSONObject();
	request.put("firstName", "Asma");
	request.put("lastName", "Slatewala");
	request.put("subjectId", 1);
	
	baseURI = "http://localhost:3000";
	
	given().
	body(request.toJSONString()).
	post("/Users").
	then().
	statusCode(201);
	
		
}
	//@Test
	public void restPut() {
		
		baseURI = "http://localhost:3000";
		
		JSONObject request1 = new JSONObject();
		
		request1.put("firstName","Dalton");
		request1.put("lastName","Science");
		request1.put("subjectId","2");
		
		given().contentType(ContentType.JSON).accept(ContentType.JSON).body(request1.toJSONString()).put("/Users/1").then().statusCode(200);
	}
	
	//@Test
	public void restDelete() {
		
		baseURI = "http://localhost:3000";
		
		when().delete("/Users/0187").then().statusCode(200).log().all();
		
	}
}
