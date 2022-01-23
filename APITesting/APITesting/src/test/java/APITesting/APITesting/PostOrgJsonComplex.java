package APITesting.APITesting;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostOrgJsonComplex {
	
	public void ComplexData(JSONObject jorg)
	{
		JSONObject inner=new JSONObject();	
		inner.put("Street","s");
		inner.put("Landmark", "s1");
	jorg.put("Name", "R1");
	jorg.put("lastname", "R2");
	jorg.put("id", "R15");
	jorg.put("Designation", "TL");
	jorg.put("Address",inner);
	
    Response res= given()
    		.contentType(ContentType.JSON)
    		.body(jorg.toString())
    		.when()
    		.post("http://localhost:3000/APIFolks");
    System.out.println("Body data posted is" + res.asString() + " Status code is" + res.getStatusCode());
    }

}
