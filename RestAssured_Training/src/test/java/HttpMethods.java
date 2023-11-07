import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.Test;

public class HttpMethods {
	int id;

	@Test(priority=1)
	void getUsers() {
		given()
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("page", equalTo(2))
			.log().all();
	}
	@Test
	void createUser() {
		HashMap data=new HashMap();
		data.put("name", "Kiran");
		data.put("job", "Automation_tester");
		
		id=given()
		.contentType("application/json")
		.body(data)
		
		.when().post("https://reqres.in/api/users").jsonPath().getInt("id");
		/*.then()
		.statusCode(201)
		.log().all();*/
	}
		@Test(priority=3,dependsOnMethods={"createUser"})
		void updateRequest() {
			HashMap data=new HashMap();
			data.put("name", "Mounika");
			data.put("job", "Tester");
			
			given()
			.contentType("application/json").body(data)
			.when()
			.put("https://reqres.in/api/users/"+id)
			
			.then()
			.statusCode(200)
			.log().all();
		}
		@Test(priority=4)
		void deleteRequest() {
			given()
			
			.when()
				.delete("https://reqres.in/api/users/"+id)
			
			.then()
					.statusCode(204)
					.log().all();
		}

}
