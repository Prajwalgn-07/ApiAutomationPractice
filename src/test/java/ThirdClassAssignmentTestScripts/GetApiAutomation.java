package ThirdClassAssignmentTestScripts;

import ApiResources.getDetailsOfFlower.GetDetailsOfFlower;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetApiAutomation {
    @Test
    public void getApi(){
        Assert.assertEquals(new GetDetailsOfFlower().getDetailsOfFlower("https://reqres.in/api/unknown/2"),200);
        System.out.println("Test ran successFully");
    }
}
