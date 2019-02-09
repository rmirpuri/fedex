package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by rajiv on 2019-02-09.
 */
public class HomePage extends BasePage{

    //WebDriver driver;
    public WebDriverWait wait;

    @FindBy(name = "trackingnumber")
    public  WebElement trackingNumberTextBox;

    @FindBy(xpath = "//button[@id='btnSingleTrack']")
    public WebElement trackingButton;


    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        //super();
    }

    public void enterTrackingNumber(String number) throws InterruptedException {
        waitForVisibility(trackingNumberTextBox, driver);
        trackingNumberTextBox.sendKeys(number);
        Thread.sleep(3000);
    }

    public void clickTrackingButton(){
        waitForVisibility(trackingButton, driver);
        trackingButton.click();
    }




}
