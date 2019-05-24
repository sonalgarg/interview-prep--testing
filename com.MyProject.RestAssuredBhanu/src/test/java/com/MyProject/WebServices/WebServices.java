package com.MyProject.WebServices;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class WebServices {

	public static Response Get(String URI) {
		RequestSpecification responseSpecification=RestAssured.given();
		responseSpecification.contentType(ContentType.JSON);
		Response response=responseSpecification.get(URI);
		return response;
	}
	public static Response Post(String URI,String stringJSON) {
		RequestSpecification responseSpecification=RestAssured.given().body(stringJSON);
		responseSpecification.contentType(ContentType.JSON);
		Response response=responseSpecification.post(URI);
		return response;
	}
	public static Response Put(String URI,String stringJSON) {
		RequestSpecification responseSpecification=RestAssured.given().body(stringJSON);
		responseSpecification.contentType(ContentType.JSON);
		Response response=responseSpecification.put(URI);
		return response;
	}
}
