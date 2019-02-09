package com.fedex.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import util.ReadFromPropertiesFile;

import java.io.IOException;

/**
 * Created by rajiv on 2019-02-09.
 */
public class base {

    public WebDriver driver;
    public WebDriverWait wait;
    public String url;

    @BeforeClass
    public void setUp() throws IOException {
        System.setProperty("webdriver.chrome.driver","/Users/rajiv/ReactApp/rajivselenium/src/main/resources/drivers/chromedriver");

        driver = new ChromeDriver();
        ReadFromPropertiesFile file = new ReadFromPropertiesFile();
        url= file.getPropVaues("config.properties", "url");
        wait=new WebDriverWait(driver, 1300);
    }

    @BeforeMethod
    public void beforeMethod(){
        //wait=new WebDriverWait(driver, 1300);


    }

    @AfterClass
    public void afterClass(){
        driver.close();
    }

}
