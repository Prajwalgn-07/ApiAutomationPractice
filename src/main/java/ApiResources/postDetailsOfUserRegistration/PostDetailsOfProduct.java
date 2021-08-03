package ApiResources.postDetailsOfUserRegistration;

import ApiResources.postDetailsOfUserRegistration.Response.PostDetailsOfProductResponse;
import com.google.gson.Gson;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PostDetailsOfProduct {
    public PostDetailsOfProductResponse postDetailsOfProduct(RequestDetailsOfProduct requestDetailsOfProduct, String postDetailsOfProductApi){
        Response response=given()
                .when()
                .body(new Gson().toJson(requestDetailsOfProduct))
                .post(postDetailsOfProductApi);
        System.out.println(response.body().asString());
        return new Gson().fromJson(response.body().asString(), PostDetailsOfProductResponse.class);
    }
}
