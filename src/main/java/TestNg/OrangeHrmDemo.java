package TestNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OrangeHrmDemo extends ParallelTesting{
    @Test()
    public void test1() {
        wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        wd.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
        wd.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
        wd.findElement(By.xpath("//*[@type='submit']")).click();
    }
}
