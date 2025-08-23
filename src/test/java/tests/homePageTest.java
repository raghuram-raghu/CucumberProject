package tests;


import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.homePage;

public class homePageTest extends BaseTest {
//
//    WebDriver driver;
//    homePage hm;

    @Test

    public void verifySignText(){

        homePage hm = new homePage(driver);

        hm.signbutton.click();

    }





}
