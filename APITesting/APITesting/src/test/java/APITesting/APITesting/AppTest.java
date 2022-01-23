/*
 * Body data can be of three 3 types
 * 1. Simple object data {  }
 * 2. Complex object data i.e object with in object { {} }
 * 3. in form of array i.e { [ {} {}] } 
 * 
 * We can pass body data in 3 ways :
 * 1. from json file
 * 2. from java code
 * 3. from org.json
 * In this program we are using json file to pass the data 
 */

package APITesting.APITesting;
//import java.util.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.*;

//import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class AppTest {

	public static void main(String[] args) throws FileNotFoundException 
	{
		/* we are reading data form sample.json file */
		File file=new File("../APITesting/sample.json");
		FileReader fr = new FileReader(file);
		JSONTokener js = new JSONTokener(fr);
		JSONObject jobj = new JSONObject(js);
		
		//Post Request
	/*	Response res= given()
		.contentType(ContentType.JSON).body(jobj.toString()).when()
		.post("http://localhost:3000/APIFolks");
		
		System.out.println("Post request Status code is:"+ res.getStatusCode());
		System.out.println("Post Body data is"+ res.asString());
		*/
		// GET Request
		//System.out.println("Get Request data is :\n"+ given().contentType(ContentType.JSON).when().
			//	get("http://localhost:3000/APIFolks").asString());
		
		//Get Request for particular id 
	//	System.out.println("Get Request data is :\n"+ given().contentType(ContentType.JSON).when().
			//	get("http://localhost:3000/APIFolks?id=8").asString());
		
		given().log().all().queryParam("id","8").contentType(ContentType.JSON).when().
		get("http://localhost:3000/APIFolks?id=8").then().log().all().statusCode(200);
	}
}
