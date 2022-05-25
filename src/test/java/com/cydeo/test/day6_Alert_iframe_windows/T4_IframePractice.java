package com.cydeo.test.day6_Alert_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_IframePractice {
    WebDriver driver;

    //@BeforeMethod
    @BeforeClass
    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");
    }

    //@Ignore
    @Test
    public void iframeTest(){
        //We need to switch driver's focus to iframe
        //option #1- switching to iframe using id attribute value
        //driver.switchTo().frame("mce_0_ifr");

        //option #2- passing index number of iframe
        driver.switchTo().frame(0);

        WebElement iframecontent =driver.findElement(By.xpath("//p"));

        Assert.assertTrue(iframecontent.isDisplayed(),"non available");
        String text = iframecontent.getText();
        System.out.println("text = " + text);
        driver.switchTo().parentFrame();
        WebElement headertext=driver.findElement(By.xpath("//h3"));
        System.out.println("headertext.getText() = " + headertext.getText());
        Assert.assertTrue(headertext.isDisplayed(),"not available");


    }
}
