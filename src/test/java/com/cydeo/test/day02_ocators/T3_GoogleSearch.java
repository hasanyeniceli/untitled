package com.cydeo.test.day02_ocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {
        // open the chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //1 . go to google.com
        driver.get("https://www.google.com");

        WebElement googleSearchBox= driver.findElement(By.name("q"));
       googleSearchBox.sendKeys("apple" + Keys.ENTER);
       //5
        // Expected : title should start with "apple" word
        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();
        System.out.println(driver.getTitle());

        if (expectedInTitle.equals(actualTitle)){
            System.out.println("pass");
        }else{
            System.out.println("Failed");
        }


    }



}
