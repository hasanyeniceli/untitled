package com.cydeo.test.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");
        WebElement resetbuttonText=driver.findElement(By.cssSelector("button[value='Reset password']"));
        String actrestpass=resetbuttonText.getText();
        String exppas="Reset password";
        if (actrestpass.equals(exppas)){
            System.out.println("pass");
        }else{
            System.out.println("failed");
        }

    }
}
