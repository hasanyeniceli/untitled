package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTst {
    public static void main(String[] args) {
        // 1- Setting up the web driver  manager
        WebDriverManager.chromedriver().setup();
        // 2-Create intance for the chrome driver
        WebDriver diver =new ChromeDriver();
        // 3- test if driver working as expected
        diver.get("https://www.google.com");
    }
}
