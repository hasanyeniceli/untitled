package com.cydeo.test.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate all the links in the page.
        //windows : alt+enter --> press enter again
        //mac     : option + Enter --> press enter again
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));// to find the all the link by the tag-name we use anhcer which is "a"
        System.out.println("allLinks.size() = " + allLinks.size()); // to see the how amny links inside lis arraylist we use the "size" method

        for (WebElement each : allLinks) {
            System.out.println("Text of link : "+ each.getText()); // to print we should use getText because each is just a webelement
            System.out.println("allLinks Href Values= " + each.getAttribute("href")); // to print webside whole link we use getatribule method and give "href"
        }
    }
}
