package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
    WebDriver wd;
    String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    @Parameters("MyBroswer")
    @BeforeTest()
    public void Test(String MyBroswer) {
        if(MyBroswer.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            wd= new ChromeDriver();
        }
        else if (MyBroswer.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            wd=new FirefoxDriver();
        }
    }
    @Test()
    public void test1() {
        wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        wd.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
        wd.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
        wd.findElement(By.xpath("//*[@type='submit']")).click();
    }
}

