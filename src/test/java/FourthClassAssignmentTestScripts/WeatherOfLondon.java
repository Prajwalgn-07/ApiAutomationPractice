package FourthClassAssignmentTestScripts;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.net.http.HttpResponse;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class WeatherOfLondon {
    @Test
    public void getWeatherOfLondon(){
        String response=given()
                .when()
                .header("x-rapidapi-key", "89c7342ad5msh510ff8df8536627p1b1a44jsnec2292d3a129")
                .header("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
                .params("q","london,uk")
                .params("cnt","12")
                .params("id","2172797")
                .params("mode","xml,html")
                .params("lon","0")
                .params("lat","0")
                .params("units","imperial,metric")
                .params("callback","test")
                .get("https://community-open-weather-map.p.rapidapi.com/weather")
                .asString();
        System.out.println(response);
    }
}
