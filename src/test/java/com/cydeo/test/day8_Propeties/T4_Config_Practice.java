package com.cydeo.test.day8_Propeties;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Config_Practice {
    /*   WebDriver driver;
 /*@BeforeTest
   public void setupMethod(){
    String browserType= ConfigurationReader.getproperty("browser");
    String envsite=ConfigurationReader.getproperty("env");
       driver = WebDriverFactory.getDriver(browserType);
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("https://www.google.com");

   }
   */
    @Test
    public void google_search_test() {
        Driver.getDriver().get("https://www.google.com");

        WebElement googlesearchbox =Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        googlesearchbox.sendKeys("Apple" + Keys.ENTER);

        String expectedTitle="Apple - Google'da Ara";
        String actualTitle=Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(expectedTitle,actualTitle);

        //4- Verify title:


    }
}
