package SecondClassAssignmentTestScripts;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public record GetApiWithQueryParameters() {
    @Test
    public void getApiWithQuery(){
        Response response=given()
                .accept(JSON)
                .queryParam("delay","3")
                .get("https://reqres.in/api/users");
        Assert.assertEquals(response.getStatusCode(),200);
        /*
        ToGetTheHeaders
         */
//        Headers allHeaders=response.headers();
//        for(Header headers:allHeaders){
//            System.out.println("Key: " + headers.getName() + " Value: " + headers.getValue()+"\n");
//        }
        System.out.println(response.body().asString());
    }
}
