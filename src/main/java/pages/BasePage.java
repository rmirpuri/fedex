package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by rajiv on 2019-02-09.
 */
public class BasePage {
    WebDriver driver;

    public BasePage(){

    }


    public void waitForVisibility(WebElement element, WebDriver driver) throws Error{
        new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOf(element));
    }
}
