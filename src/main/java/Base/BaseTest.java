package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utility.Log;

import java.time.Duration;

public class BaseTest {

   protected WebDriver driver;

    @BeforeMethod

    public   void setUp() {

        WebDriverManager.chromedriver().setup();

        Log.info("rgdytf");
        driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/html/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }

    @AfterMethod
    public void close(){

        if(driver!=null){
        driver.quit();

    }}
}