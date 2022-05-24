package com.cydeo.test.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementReferenceException {
    public static void main(String[] args) {
        //TC #6: StaleElementReferenceException Task
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate “CYDEO” link, verify it is displayed
        WebElement cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));

        //4- Refresh the page.
        driver.navigate().refresh();

        // due to StaleElementException we have to re find the element because when we refref we lose our connection
        cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']")); // re create element reference
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());


    }

}
