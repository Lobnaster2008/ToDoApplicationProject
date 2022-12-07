package com.end2end.todo.api;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import com.end2end.todo.utils.ConfigFileReader;

public class RegisterApi {

	private ConfigFileReader configFileReader;
	public RegisterApi() {
		
		configFileReader = new ConfigFileReader();
	}
	public void register() {
		String data = " ";
		Response response = 
				given().baseUri(configFileReader.getProperties("baseUrl"))
					.header("content-type","json-application")
					.body(data)
			   .when().post("/login")
			.then().extract().response();
		
		int message =response.statusCode();
		System.out.println(message);
		
	}

}
