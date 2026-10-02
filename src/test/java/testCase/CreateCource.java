package testCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import baseUrl.Routes;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateCource extends Routes{ 

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream payload = new FileInputStream("./testData/p_lab_data.json");
		RestAssured
		 
		.given()
		      .body(payload)
		      .contentType(ContentType.JSON)
		.when()
		      .post(Base_URL+create_Cource)
		.then()
		      .statusCode(201)
		      .log().all()
		      .body("title", Matchers.equalTo("Selenium Python_123"))
		      .body("category", Matchers.equalTo("Web_123"))
		      .body("level", Matchers.equalTo("Advanced_123"))
		      .body("price", Matchers.equalTo(334.99f))
		      .body("language", Matchers.equalTo("English_123"))
		      .body("active", Matchers.equalTo(true));

	}

}
