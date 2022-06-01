package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTablesUtils {
    // Method #1 info:
    //• Name: returnOrderDate ()
    //• Return type: String
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //This method should accept a costumerName and return the costumer order date
    //as a String.

    public static String returnOrderdate(WebDriver driver, String costumerName){
        String locator="//td[.='"+costumerName+"']/following-sibling::td[3]";
        WebElement custoerDatecell= driver.findElement(By.xpath(locator));
        return  custoerDatecell.getText();
    }


    public static void orderverify(WebDriver driver, String customerName, String expectedDate){
        String locator = "//td[.='"+customerName+"']/following-sibling::td[3]";
        WebElement customerDateCell=driver.findElement(By.xpath(locator));
        String actualOrderDate=customerDateCell.getText();
        Assert.assertEquals(actualOrderDate,expectedDate);

    }

}
