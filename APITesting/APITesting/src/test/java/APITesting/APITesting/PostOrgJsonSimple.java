package APITesting.APITesting;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostOrgJsonSimple {
	
	public void simpleData(JSONObject jorg)
	{
	jorg.put("Name", "R1");
	jorg.put("lastname", "R2");
	jorg.put("id", "R12");
	jorg.put("Designation", "TL");
	
    Response res= given()
    		.contentType(ContentType.JSON)
    		.body(jorg.toString())
    		.when()
    		.post("http://localhost:3000/APIFolks");
    System.out.println("Body data posted is" + res.asString() + " Status code is" + res.getStatusCode());
    }
}
