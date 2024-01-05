package Priority_Seviority;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Demoqa {
    WebDriver driver;
    @BeforeTest
    public void test1 () throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }
    @Test(enabled = false)
    public void login()
    {
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.xpath("//*[@placeholder='Full Name']")).sendKeys("Ramu7");
        driver.findElement(By.xpath("//*[@placeholder='name@example.com']")).sendKeys("navihe6866@vreaa.com");
        driver.findElement(By.xpath("//*[@id='currentAddress']")).sendKeys("AAHAPURAML LO");
        driver.findElement(By.xpath("//*[@id='permanentAddress']")).sendKeys("AAHAPURAML LO");
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();

    }
    @Test (enabled = true)
    public void clickcheckbox() throws InterruptedException
    {
        driver.get("https://demoqa.com/checkbox");
        driver.findElement(By.xpath("(//*[@class='rct-collapse rct-collapse-btn'])[1]")).click();
        driver.findElement(By.xpath("((//*[@class='rct-collapse rct-collapse-btn'])[2]")).click();
        driver.findElement(By.xpath("(//*[@class='rct-collapse rct-collapse-btn'])[3]")).click();
    }
    @Test(enabled = false)
    public void radiobutton()
    {
        driver.get("https://demoqa.com/radio-button");
        driver.findElement(By.xpath("(//*[@class='custom-control-label'])[1]")).click();
    }
    @Test (enabled = false)
    public void gettitle(){
        driver.get("https://demoqa.com/");
        String str = driver.getTitle();
        System.out.println(str);
        Assert.assertEquals(str, "DEMOQA");
    }

}
