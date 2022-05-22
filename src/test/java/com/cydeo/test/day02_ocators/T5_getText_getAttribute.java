package com.cydeo.test.day02_ocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {
    public static void main(String[] args) {
        //TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement headerText=driver.findElement(By.tagName("h2"));
        //Expected: Registration form
        String expectedHeaderText = "Registration form"; // we create variable to check it
        String actualHeaderText=headerText.getText();
        if (expectedHeaderText.equals(actualHeaderText)){
            System.out.println("pass");
        }else{
            System.out.println("failed");
        }
        //4- Locate “First name” input box
        // we are locating the web element using "name" locator
        // name attribute has "firstname" value
        //WebElement firstNameInput = driver.findElement(By.name("firstname"));

        driver.close();



    }
}