package SecondClassAssignmentTestScripts;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostApi {
    @Test
    public void postData(){
        Response response=given()
                .body("{\n" +
                        "    \"name\":\"prajwal\",\n" +
                        "    \"nickName\":\"gowda\",\n" +
                        "    \"designation\":\"intern\"\n" +
                        "}")
                .post("https://reqres.in/api/users");
        Assert.assertEquals(response.getStatusCode(),201);
        System.out.println(response.body().asString());
    }
}
