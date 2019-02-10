package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by rajiv on 2019-02-09.
 */
public class TrackingPageDetails extends BasePage{


    WebDriver driver;

    @FindBy(xpath = "//div[@class='dp_error_title']")
    WebElement notFoundText;

    public TrackingPageDetails(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public String getErrorText(){
        waitForVisibility(notFoundText, driver);
        return  notFoundText.getText();
    }

}
