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

    public WebDriverWait wait;

    @FindBy(name = "trackingnumber")
    public  WebElement trackingNumberTextBox;

    @FindBy(xpath = "//button[@id='btnSingleTrack']")
    public WebElement trackingButton;

    @FindBy(xpath = "//div[@class='link']/a[text()='MULTIPLE TRACKING NUMBERS']")
    public  WebElement multipleTrackingNumbers;





    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
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

    public HomePageMultipleTrackingPage clickMultipleTrackingNumbers(){
        waitForVisibility(multipleTrackingNumbers, driver);
        multipleTrackingNumbers.click();
        return new HomePageMultipleTrackingPage(driver);
    }




}
