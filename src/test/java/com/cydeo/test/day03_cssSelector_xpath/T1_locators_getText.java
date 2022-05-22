package com.cydeo.test.day03_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");
        driver.findElement(By.className("login-inp"));
        WebElement inputUsername=driver.findElement(By.className("login-inp"));
        inputUsername.sendKeys("incorrect");

        WebElement inputPassword=driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");
        WebElement loginbutton = driver.findElement(By.className("login-btn"));
        loginbutton.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errorMassage= driver.findElement(By.className("errortext"));

        String expectedErrorMessage="Incorrect login or password";
        String actualErrorMessage=errorMassage.getText();
        if (expectedErrorMessage.equals(actualErrorMessage)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }



    }
}
