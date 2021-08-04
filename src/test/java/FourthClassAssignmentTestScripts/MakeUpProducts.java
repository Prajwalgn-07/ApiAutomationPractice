package FourthClassAssignmentTestScripts;

import io.restassured.response.Response;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class MakeUpProducts {
    @Test
    public void getProductsBlackColor(){
        Response products=given()
                .when()
                .get("http://makeup-api.herokuapp.com/api/v1/products.json");
        AccessingPropertiesOfProduct accessingPropertiesOfProduct=new AccessingPropertiesOfProduct(products);
//        //To get unique products
//        accessingPropertiesOfProduct.printUniqueProducts();
//        //To get natural products
//        accessingPropertiesOfProduct.printNaturalProducts();
        //To get black color products
        accessingPropertiesOfProduct.printProductsInBlackColor();
    }
}
