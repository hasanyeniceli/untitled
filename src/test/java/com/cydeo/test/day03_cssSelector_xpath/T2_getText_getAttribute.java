package com.cydeo.test.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2- Go to: https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");
        //3- Verify “remember me” label text is as expected:
        // Expected: Remember me on this computer
       WebElement rememberLabel= driver.findElement(By.className("login-item-checkbox-label"));


       String expectedrememberLabel="Remember me on this computer";
       String actualremmberMeLaber=rememberLabel.getText();
       if (actualremmberMeLaber.equals(expectedrememberLabel)){
           System.out.println("PAssed");
       }else{
           System.out.println("Failed");
       }




    }
}
