package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

   protected WebDriver driver;

    @BeforeMethod

    public   void setUp() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/html/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }



    @AfterMethod
    public void close(){

        driver.quit();

    }
}