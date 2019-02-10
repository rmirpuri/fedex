/**
 * Created by rajiv on 2019-02-09.
 */

package com.fedex.tracking.negative.scenario;

import com.fedex.base.base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HomePageMultipleTrackingPage;
import pages.TrackingPageDetails;


public class NegativeScenario extends base {

    @Test
    public void testIncorrectTrackingNumber() throws InterruptedException {
        driver.get(url);
        System.out.println("Tesing Incorrect Tracking number");
        HomePage homePage = new HomePage(driver);
        homePage.enterTrackingNumber("234234234");
        homePage.clickTrackingButton();
        TrackingPageDetails trackingPageDetails = new TrackingPageDetails(driver);
        Assert.assertEquals(trackingPageDetails.getErrorText(), "Not found");
    }

    @Test
    public void testMultipleTrackingNumbersPage() throws InterruptedException {
        System.out.println("Multiple Tracking number page displayed Test");
        driver.get(url);
        HomePage homePage = new HomePage(driver);
        HomePageMultipleTrackingPage multipleTrackingPage = homePage.clickMultipleTrackingNumbers();
        Assert.assertEquals(multipleTrackingPage.getMultipleVerficationNumberText(), "Enter up to 30 FedEx tracking numbers");
    }


    @Test
    public void testInvalidTrackingNumber() throws InterruptedException {
        driver.get(url);
        HomePage homePage = new HomePage(driver);
        HomePageMultipleTrackingPage multipleTrackingPage = homePage.clickMultipleTrackingNumbers();
        multipleTrackingPage.enterTrackingOnFirstTextBox("2342343243");
        TrackingPageDetails trackingPageDetails = multipleTrackingPage.clickTrackButton();
        Assert.assertEquals(trackingPageDetails.getErrorText(), "Not found");
    }
}
