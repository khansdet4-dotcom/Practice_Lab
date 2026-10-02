package testCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.hamcrest.Matchers;

import baseUrl.Routes;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Partial_update_Cource extends Routes{

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream payload = new FileInputStream("./testData/p_lab_partialUpdateData3.json");
        
		RestAssured
		.given()
		       .body(payload)
		       .contentType(ContentType.JSON)
		       .pathParam("id", 21)
		.when()
		       .patch(Base_URL+single_Cources_by_id)
		.then()
		      .statusCode(200)
		      .log().all()
		      .body("title", Matchers.equalTo("Embedded +Python+AI_009x23"))
		      .body("category",Matchers.equalTo("PYTHON_CUDA_009x23"))
		      .body("level", Matchers.equalTo("Advanced_CUDA_009x23"))
		      .body("price", Matchers.equalTo(334.99F))
		      .body("language", Matchers.equalTo("English_123"))
		      .body("active", Matchers.equalTo(true));
	}

}
