package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Log;
public class homePage {


    private WebDriver driver;


   public homePage(WebDriver driver){

           this.driver=driver;
       Log.info("sdfg");
       PageFactory.initElements(driver,this);

   }


    @FindBy(css = ".button-text")
    public WebElement signbutton;



}
