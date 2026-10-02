package testCase;

import baseUrl.Routes;
import io.restassured.RestAssured;

public class Get_All_Cources extends Routes{

	public static void main(String args[]) {
		RestAssured
		
		.given()
		      
		.when()
		     .get(Base_URL+all_Cources)
		.then()
		     .log().all()
		     .statusCode(200);
	}
}
