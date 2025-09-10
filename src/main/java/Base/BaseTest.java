package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utility.ExtentReportManager;
import utility.Log;

import java.time.Duration;

public class BaseTest {

   protected WebDriver driver;
   protected static ExtentReports extent;
   protected ExtentTest test;

   @BeforeSuite
   public void setupReport(){

       extent = ExtentReportManager.getReportInstance();
   }

   @AfterSuite
    public void teardownReport(){

       extent.flush();

    }

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