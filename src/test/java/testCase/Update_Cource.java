package testCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import baseUrl.Routes;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Update_Cource extends Routes{

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream payload = new FileInputStream("./testData/p_lab_updateData2.json");
		RestAssured
		.given()
		       .pathParam("id", 20)
		       .body(payload)
		       .contentType(ContentType.JSON)
		.when()
		      .put(Base_URL+single_Cources_by_id)
		.then()
		      .statusCode(200)
		      .log().all();

	}

}
