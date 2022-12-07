package com.end2end.todo.pageobject;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
public class TestRestAssured {

	public TestRestAssured() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String request ="{\r\n"
				+ "  \"email\": \"layouna3@gmail.com\",\r\n"
				+ "  \"password\": \"123456\",\r\n"
				+ "  \"firstName\": \"LAYEN1\",\r\n"
				+ "  \"lastName\": \"MAROUANI1\"\r\n"
				+ "}";
		Response response = 
				given().
				baseUri("https://qacart-todo.herokuapp.com")
				.header("Content-Type", "application/json")
				.body(request)
		.when()
				.post("api/v1/users/register")
		.then()
				.extract().response();
		int message =response.statusCode();
		System.out.println(message);

	}

}
