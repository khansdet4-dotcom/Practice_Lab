package testCase;

import baseUrl.Routes;
import io.restassured.RestAssured;

public class Delete_Cource extends Routes{

	public static void main(String[] args) {
		RestAssured
		
		.given()
		      .pathParam("id", 21)
		.when()
		      .delete(Base_URL+single_Cources_by_id)
		.then()
		        .statusCode(200);

	}

}
