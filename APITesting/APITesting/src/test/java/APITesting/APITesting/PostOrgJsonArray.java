package APITesting.APITesting;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostOrgJsonArray {

	public void ArrayData(JSONObject jorg)
	{
		JSONObject inner=new JSONObject();	
		inner.put("Street","s");
		inner.put("Landmark", "s1");
		
		JSONObject inner1=new JSONObject();	
		inner1.put("Street","s1");
		inner1.put("Landmark", "s2");
		
		JSONArray jarr=new JSONArray();
		jarr.put(0,inner);
		jarr.put(1,inner1);
		
	jorg.put("Name", "R1");
	jorg.put("lastname", "R2");
	jorg.put("id", "R18");
	jorg.put("Designation", "TL");
	jorg.put("Address",jarr);
	
    Response res= given()
    		.contentType(ContentType.JSON)
    		.body(jorg.toString())
    		.when()
    		.post("http://localhost:3000/APIFolks");
    System.out.println("Body data posted is" + res.asString() + " Status code is" + res.getStatusCode());
    }
}
