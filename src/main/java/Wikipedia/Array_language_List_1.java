package Wikipedia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Array_language_List_1 {
    WebDriver driver;
    @BeforeTest
    public void wikipedia(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.wikipedia.org/");

    }
    @Test()
    public  void testLanguageListSorting() throws InterruptedException {

        // Extract the language names from the language list
        List<WebElement> languageElements = driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));
        List<String> languageNames = new ArrayList<>();
        for (WebElement languageElement : languageElements) {
            languageNames.add(languageElement.getText());
        }

        // Sort the language names alphabetically
        Collections.sort(languageNames);

        // Print the sorted language names
        System.out.println("Sorted Language List:");
        for (String languageName : languageNames) {
            System.out.println(languageName);
        }
    }

    }






