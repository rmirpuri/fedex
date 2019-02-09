package com.fedex.tracking.negative.scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PG1 {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","/Users/rajiv/ReactApp/rajivselenium/src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, 1300);

        String baseUrl = "https://www.fedex.com/en-ca/home.html";
        driver.get(baseUrl);



        WebElement trackingNumberTextBox, trackingButton, notFoundText;
        trackingNumberTextBox= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("trackingnumber")));
        trackingNumberTextBox.sendKeys("234234234");
        Thread.sleep(3000);

        trackingButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btnSingleTrack']")));
        trackingButton.click();
        trackingButton.click();


        notFoundText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dp_error_title']")));


        if(notFoundText.getText().equals("Not found")){
            System.out.println("Text  found");
        }else{
            System.out.println("Text Not found");
        }


        driver.close();

    }

}
