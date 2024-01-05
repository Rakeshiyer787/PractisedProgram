package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Book_Flight {
    WebDriver driver;
    @BeforeTest
    public void Test() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.airvistara.com/");
    }
     @Test
    public void RoundTrip(){
         driver.get("https://www.airvistara.com/");
         driver.findElement(By.xpath("//button[@id='acceptAllBtn']")).click();
         driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("DEL");// Select from City
         driver.findElement(By.xpath("//input[@name='flightSearchTo']]")).sendKeys("BLR");// select to City
         driver.findElement(By.xpath("//input[@name='depart']")).click();// Select departure icon
         driver.findElement(By.xpath("//div[@class='month col-xs-2 col-sm-2 col-md-3 mon-dec active']")).click();//Select Month
         driver.findElement(By.xpath("//td[@class='  everymundo']")).click();//Selects Date 29-12-2023
         driver.findElement(By.xpath("//input[@id='returnCalendar']")).click();// Select return icon
         driver.findElement(By.xpath("//div[@id='nextYr']")).click();// Select Year
         driver.findElement(By.xpath("//div[@class='month col-xs-2 col-sm-2 col-md-3 mon-jan active']")).click();//Select Month
         driver.findElement(By.xpath("(//td[@class='  everymundo'])[3]")).click();//Selects Date 04-01-2024
         driver.findElement(By.xpath("//input[@name='passengers']")).click();//Select Passengers icon
         driver.findElement(By.xpath("//button[@id='adds_child']")).click();// Select 1child
         driver.findElement(By.xpath("//button[@id='adds_infant']")).click(); //Select 1 infant
         driver.findElement(By.xpath("//button[@class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']")).click();// Click on done after selecting passenger
         driver.findElement(By.xpath("//button[@class='widget-btn aubergine-button-dark search_book_flights']")).click();// Click on search

     }
    @Test
    public void ModifySearch() {
        driver.findElement(By.xpath("//button[@class='plnext-widget-btn btn btn-default pull-right btn-hide-search']")).click();// Select Modify search
        driver.findElement(By.xpath("//input[@placeholder='Origin']")).sendKeys("Hyderabad, Rajiv Gandhi International (HYD)");// Changing Origin
        driver.findElement(By.xpath("//input[@placeholder='Destination']")).sendKeys("Delhi, Indira Gandhi International (DEL)");// Changing Destination
        driver.findElement(By.xpath("//button[@id='w30']")).click();//Click on search
        // Locate the flight list on the page
        WebElement FlightList = driver.findElement(By.xpath("(//div[@class='row upsell-bound'])[1]"));
        // Extract the flight names from the flight list
        List<WebElement> Flightelements = FlightList.findElements(By.xpath("(//div[@class='row upsell-bound'])[1]"));
        List<String> FlightNames = new ArrayList<>();
        for (WebElement languageElement : Flightelements) {
            FlightNames.add(languageElement.getText());
        }

    }
}
