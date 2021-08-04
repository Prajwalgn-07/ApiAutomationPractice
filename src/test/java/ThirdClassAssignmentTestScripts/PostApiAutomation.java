package ThirdClassAssignmentTestScripts;

import ApiResources.postDetailsOfUserRegistration.PostDetailsOfProduct;
import ApiResources.postDetailsOfUserRegistration.RequestDetailsOfProduct;
import ApiResources.postDetailsOfUserRegistration.Response.PostDetailsOfProductResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PostApiAutomation {
    Properties properties = new Properties();
    @BeforeMethod
    public void setProperty(){
        try (InputStream input = new FileInputStream("/Users/prajwal/Desktop/testvagrant /assignment projects/ApiAutomationPractice/src/main/java/properties/productDetails.properties")) {
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    @Test
    public void postApiAddingTheProduct() {
        RequestDetailsOfProduct requestDetailsOfProduct=new RequestDetailsOfProduct();
        requestDetailsOfProduct.setTitle(properties.getProperty("title"));
        requestDetailsOfProduct.setCategory(properties.getProperty("category"));
        requestDetailsOfProduct.setPrice(properties.getProperty("price"));
        requestDetailsOfProduct.setDescription(properties.getProperty("description"));
        requestDetailsOfProduct.setImage(properties.getProperty("imageLink"));
        PostDetailsOfProductResponse postDetailsOfProductResponse=new PostDetailsOfProduct().postDetailsOfProduct(requestDetailsOfProduct,"https://fakestoreapi.com/products");
        List<String>list=new ArrayList<>();
        list.add("1");
        list.add("21");
        Assert.assertTrue(list.contains(postDetailsOfProductResponse.getId()));
    }
}

