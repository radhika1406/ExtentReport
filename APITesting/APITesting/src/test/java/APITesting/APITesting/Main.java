/* in this we are using org.json to pass the data */
package APITesting.APITesting;

import org.json.JSONObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class Main {
	
	public static void main(String[] args) {

		PostOrgJsonSimple simple=new PostOrgJsonSimple();
		JSONObject jorg=new JSONObject();
		//simple.simpleData(jorg);
		PostOrgJsonComplex complex=new PostOrgJsonComplex();
		//complex.ComplexData(jorg);
		
		PostOrgJsonArray arry=new PostOrgJsonArray();
		arry.ArrayData(jorg);
	}

}

