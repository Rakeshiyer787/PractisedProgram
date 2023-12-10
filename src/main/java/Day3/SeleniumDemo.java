package Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SeleniumDemo {
    protected WebDriver driver;
    @Test
    public void GmailDemo() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--Incognito");
        driver = new ChromeDriver(options);
        driver.get("https://wwww.gmail.com");
        /*driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("rakesh.iyer.sp@gmail.com");
        driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
        driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("RAKESH@iyer2023");
        driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();*/

    }
}
