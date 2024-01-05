package Listeners;

import org.testng.*;

public class CustomListenersTest implements ITestListener {

    //This belongs to ITestLister & will excute before starting of test
    public void onStart(ITestContext arg) {
        System.out.println("Strat test execution....."+arg.getName());
    }
    //This belongs to ITestLister & will excute before starting of test
    public void onFinish(ITestContext arg) {
        System.out.println("Finish test execution....."+arg.getName());
    }
    //This belongs to ITestLister & will excute before main test start i.e @test
    public void onTestStart(ITestResult arg0) {
        System.out.println("Starts Test....."+arg0.getName());
    }
    //This belongs to ITestLister & will excute when a test skipped
    public void onTestSkipped(ITestResult arg0) {
       System.out.println("Skipped test...."+arg0.getName());
    }
    //This belongs to ITestLister & will excute when a test passed
    public void onTestSuccess(ITestResult arg0) {
        System.out.println("Passed Test...."+arg0.getName());
    }
    //This belongs to ITestLister & will excute when a test failed
    public void onTestFailure(ITestResult result) {
        System.out.println("Failure of test cases and its details are : "+result.getName());
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    // TODO Auto-generated method stub
        System.out.println("Failure of test cases and its details are : "+result.getName());
    }

}


