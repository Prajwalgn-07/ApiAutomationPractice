package ApiResources.getDetailsOfFlower;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetDetailsOfFlower {
    public int getDetailsOfFlower(String detailsOfFlower){
        Response response=given()
                .when()
                .get(detailsOfFlower);
        return response.getStatusCode();
    }
}
