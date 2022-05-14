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



    }
}
