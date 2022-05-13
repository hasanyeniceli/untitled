package com.cydeo.test.day02_ocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPag {
    public static void main(String[] args) {
        // 1- Setting up the web driver  manager
        WebDriverManager.chromedriver().setup();
        // 2-Create intance for the chrome driver
        WebDriver driver =new ChromeDriver();
        // 3- test if driver working as expected
        driver.get("https://library2.cybertekschool.com/login.html");

        WebElement usurnameInput= driver.findElement(By.className("form-control"));
        usurnameInput.sendKeys("incorrect@email.com");
         //4 locate password
        WebElement passwordInput=driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrectpassword");
        //5. Click to Sign in button
        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();




    }



}
