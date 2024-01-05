package Dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example {
    @Test
    public void startcar(){
        System.out.println("Car started");
        Assert.fail();
    }
    @Test(dependsOnMethods = {"startcar"})
    public void drivecar(){
        System.out.println("Car driving");
    }
    @Test(dependsOnMethods = {"drivecar"})
    public void stopcar(){
        System.out.println("Car stopped");
    }
    @Test(dependsOnMethods = {"stopcar","drivecar"},alwaysRun = true)
    public void parkcar(){
        System.out.println("Car parked");
    }
}
