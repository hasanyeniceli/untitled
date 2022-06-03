package com.cydeo.test.day8_Propeties;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Config_Practice {
    WebDriver driver;
@BeforeTest
public void setupMethod(){
 String browserType= ConfigurationReader.getproperty("browser");
 String envsite=ConfigurationReader.getproperty("env");
    driver = WebDriverFactory.getDriver(browserType);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get(envsite);

}

    @Test
    public void google_search_test() {
        WebElement googlesearchbox = driver.findElement(By.xpath("//input[@name='q']"));
        googlesearchbox.sendKeys("Apple" + Keys.ENTER);

        String expectedTitle="Apple - Google'da Ara";
        String actualTitle=driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(expectedTitle,actualTitle);

        //4- Verify title:


    }
}
