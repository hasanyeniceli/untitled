package com.cydeo.test;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
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
