package FourthClassAssignmentTestScripts;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.restassured.response.Response;

import java.util.*;

public class AccessingPropertiesOfProduct {
    public int size;
    public Response response;
    List<String>productNames=new ArrayList<>();
    public AccessingPropertiesOfProduct(Response response){
        List<String>productsResponse=response.jsonPath().getList("$");
        size=productsResponse.size();
        this.response=response;
    }
    public void printProductsInBlackColor(){
        for(int i=0;i<size;i++){
            String productName=response.jsonPath().getString("["+i+"].name");
            int sizeOfColorsInTheCurrentId=response.jsonPath().get("["+i+"].product_colors.size()");
            for(int j=0;j<sizeOfColorsInTheCurrentId;j++){
                String baseColor="Black";
                String color=response.jsonPath().getString("["+i+"].product_colors["+j+"].colour_name");
                if(color.toLowerCase().contains(baseColor.toLowerCase())){
                    System.out.println(productName);
                 break;
                }
            }
            }
        }
    public void printUniqueProducts(){
        System.out.println("Number of products "+size);
        for(int i=0;i<size;i++){
            String productName=response.jsonPath().getString("["+i+"].name");
            productNames.add(productName);
        }
        HashSet<String>uniqueProducts=new HashSet<>(productNames);
        System.out.println("Number of unique products "+ uniqueProducts.size());
        System.out.println("The unique products are "+"\n"+uniqueProducts);
    }
    public void printNaturalProducts(){
        for(int i=0;i<size;i++){
            List<String>tagList=response.jsonPath().getList("["+i+"].tag_list");
            String productName=response.jsonPath().getString("["+i+"].name");
            if(tagList.contains("Natural")){
                System.out.println(productName);
            }
        }
    }
}
