package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by rajiv on 2019-02-09.
 */
public class HomePageMultipleTrackingPage extends  BasePage{

    public WebDriverWait wait;

    @FindBy(xpath = "//h2[text()='Enter up to 30 FedEx tracking numbers']")
    public WebElement multipleTrackingNumberText;

    @FindBy(xpath = "//input[@title='hero|MultiTrack 1']")
    public WebElement multipleTrackingNumberInputField1;

    @FindBy(id = "btnMultiTrack")
    public  WebElement trackButton;

    public HomePageMultipleTrackingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getMultipleVerficationNumberText(){
        waitForVisibility(multipleTrackingNumberText, driver);
        System.out.println("Text for multiple tracking number is: "+ multipleTrackingNumberText.getText());
        return multipleTrackingNumberText.getText();
    }

    public void enterTrackingOnFirstTextBox(String text) throws InterruptedException {
        waitForVisibility(multipleTrackingNumberInputField1, driver);
        multipleTrackingNumberInputField1.sendKeys(text);
        Thread.sleep(3000);
    }

    public TrackingPageDetails clickTrackButton(){
        waitForVisibility(trackButton, driver);
        trackButton.click();
        return new TrackingPageDetails(driver);
    }

}
