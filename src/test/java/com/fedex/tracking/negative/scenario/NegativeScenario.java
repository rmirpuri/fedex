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
        System.out.println("IN  test 1");
        HomePage homePage = new HomePage(driver);
        homePage.enterTrackingNumber("234234234");
        homePage.clickTrackingButton();
        TrackingPageDetails trackingPageDetails = new TrackingPageDetails(driver);
        Assert.assertEquals(trackingPageDetails.errorText(), "Not found");
    }

    @Test
    public void anotherTest(){
        System.out.println("IN  test 2");
    }


}
