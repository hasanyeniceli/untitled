package com.cydeo.test.day6_Alert_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T5_Windows_Practice {
    WebDriver driver;

    //@BeforeMethod
    @BeforeClass
    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/windows");
    }
    @Test
    public void multiple_windos_test(){
        String windowHandle=driver.getWindowHandle();
        System.out.println("Title of the windoew Title :"+ driver.getTitle());
        System.out.println("windowHandle = " + windowHandle);


        //4. Assert: Title is “Windows”
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

        System.out.println("Title before click: " + actualTitle);

        WebElement clickHere=driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickHere.click();
        // we can store our set of unique open windows inside the "set"
        Set<String> allopenWindows=driver.getWindowHandles();
        // window handle 1 main window
        //window handle 2 new window Tab


        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("current title while switching windows : " + driver.getTitle());
        }

        String newExpectedtitle="New Window";

        actualTitle=driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle,"not match");

        System.out.println("actualTitle aftre click= " + actualTitle);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    }
