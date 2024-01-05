import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {
    @BeforeMethod
    public void beforemethod(){
        System.out.println("This will run before every test");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("This will run afer every test");
    }
    @Test
    public void test1(){
        System.out.println("This is my first test");
    }
    @Test
    public void test2(){
        System.out.println("This my Second Test");
    }
}
