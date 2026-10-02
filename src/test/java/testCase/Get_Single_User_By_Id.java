package testCase;

import baseUrl.Routes;
import io.restassured.RestAssured;

public class Get_Single_User_By_Id extends Routes{

	public static void main(String[] args) {
		
		RestAssured
		
		.given()
		        .pathParam("id", 4)
		.when()
		     .get(Base_URL+single_Cources_by_id)
		.then()
		      .statusCode(200)
		      .log().all();
		      
		      
		

	}

}
