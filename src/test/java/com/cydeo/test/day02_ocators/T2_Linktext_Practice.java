package com.cydeo.test.day02_ocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_Linktext_Practice {
    public static void main(String[] args) {
        //TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");
        System.out.println(driver.getTitle());
        //3- Click to A/B Testing from top of the list.
       //  driver.findElement(By.linkText("A/B Testing")).click(); to go to inside of the link we add click method
        WebElement abTestlink = driver.findElement(By.linkText("A/B Testing"));
        abTestlink.click();
        String expectedTitle="A/B Testing";
        String actualtitle= driver.getTitle();
        if (actualtitle.equals(expectedTitle)){
            System.out.println("passed");

        }else{
            System.out.println("failed");
        }
        //4- Verify title is:
        //Expected: No A/B Test
        String expectedTitle2 = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle2)){
            System.out.println("Title verification PASS!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }
        //5- Go back to home page by using the .back();
        driver.navigate().back(); // when we go back now our current page is became practice.cydeo.com

        //6- Verify title equals:
        //Expected: Practice
        expectedTitle = "Practice";
        actualtitle = driver.getTitle();

        if (actualtitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

        //BREAK UNTIL 1.01PM CST
        //BREAK UNTIL 2.01PM EST


    }
}
