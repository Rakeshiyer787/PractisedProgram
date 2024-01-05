import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myfirsttestcase {

    @BeforeTest
    public void setup(){
        System.out.println("SetupBroswer");

    }
    @Test(priority = 2)
    public void open(){
        System.out.println("OpenBroswer");
    }
    @Test(priority = 1)
    public void search(){
        System.out.println("search the product");
    }
    @AfterTest
    public void teardown(){
        System.out.println("Closing Broswer");
    }
}
