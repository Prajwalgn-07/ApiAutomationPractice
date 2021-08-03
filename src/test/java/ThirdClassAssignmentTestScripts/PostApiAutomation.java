package ThirdClassAssignmentTestScripts;

import ApiResources.postDetailsOfUserRegistration.PostDetailsOfProduct;
import ApiResources.postDetailsOfUserRegistration.RequestDetailsOfProduct;
import ApiResources.postDetailsOfUserRegistration.Response.PostDetailsOfProductResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PostApiAutomation {
    @Test
    public void postApiAddingTheProduct() {
        RequestDetailsOfProduct requestDetailsOfProduct=new RequestDetailsOfProduct();
        requestDetailsOfProduct.setTitle("test product");
        requestDetailsOfProduct.setCategory("electronic");
        requestDetailsOfProduct.setPrice("13.5");
        requestDetailsOfProduct.setDescription("lorem ipsum set");
        requestDetailsOfProduct.setImage("https://i.pravatar.cc");
        PostDetailsOfProductResponse postDetailsOfProductResponse=new PostDetailsOfProduct().postDetailsOfProduct(requestDetailsOfProduct,"https://fakestoreapi.com/products");
        List<String>list=new ArrayList<>();
        list.add("1");
        list.add("21");
        Assert.assertTrue(list.contains(postDetailsOfProductResponse.getId()));
    }
}

