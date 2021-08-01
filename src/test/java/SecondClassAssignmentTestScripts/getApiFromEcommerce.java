package SecondClassAssignmentTestScripts;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class getApiFromEcommerce {
    @Test
    public void getImageFromAmazon(){
        Response response=given()
                .when()
                .get("https://images-eu.ssl-images-amazon.com/images/G/31/IMG15/Irfan/GATEWAY/MSO/B07G5J5FYP._SY232_CB667322346_.jpg");
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
