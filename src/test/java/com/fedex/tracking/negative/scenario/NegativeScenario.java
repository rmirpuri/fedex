/**
 * Created by rajiv on 2019-02-09.
 */

package com.fedex.tracking.negative.scenario;

import com.fedex.base.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.TrackingPageDetails;


public class NegativeScenario extends base {





    @Test
    public void testIncorrectTrackingNumber() throws InterruptedException {
        driver.get(url);
        HomePage homePage = new HomePage(driver);
        //Thread.sleep(3000);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("trackingnumber")));
        homePage.enterTrackingNumber("234234234");
        //Thread.sleep(3000);
        homePage.clickTrackingButton();

        //Thread.sleep(3000);

        TrackingPageDetails trackingPageDetails = new TrackingPageDetails(driver);
        Assert.assertEquals(trackingPageDetails.errorText(), "Not found");


//        WebElement trackingNumberTextBox, trackingButton, notFoundText;
//        trackingNumberTextBox= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("trackingnumber")));
//        trackingNumberTextBox.sendKeys("234234234");
//        Thread.sleep(3000);
//
//        trackingButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btnSingleTrack']")));
//        trackingButton.click();
//
//        notFoundText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dp_error_title']")));
//
//        Assert.assertEquals(notFoundText.getText(),"Not found");

    }


}
