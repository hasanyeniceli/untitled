package com.cydeo.test.day6_Alert_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
       driver= WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("https://practice.cydeo.com/javascript_alerts");
    }
    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }
    @Test
    public void alert_Test1() throws InterruptedException {
        // to find the element we use the text in the element
        WebElement jsAlertButton=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsAlertButton.click();

        Alert alert= driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();
        WebElement result=driver.findElement(By.cssSelector("p[id='result'"));

        //Failure message will only be displayed if assertion fails: "Result text is NOT displayed."
        Assert.assertTrue(result.isDisplayed(), "Result text is NOT displayed.");

        String actualresult=result.getText();
        String expectedResult="You successfully clicked an alert";
        Assert.assertEquals(actualresult,expectedResult);



        WebElement jsConfirm= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jsConfirm.click();
        driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();




    }
}
