package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {
        // 1- Setting up the web driver  manager
        WebDriverManager.chromedriver().setup();
        // 2-Create intance for the chrome driver
        WebDriver driver =new ChromeDriver();
        // 3- test if driver working as expected
        driver.get("https://www.tesla.com");
        String currentTitle=driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        // to stop code for 3 seconds execution
        Thread.sleep(3000);
        driver.navigate().back(); // to go back on the web side
        Thread.sleep(3000);
        driver.navigate().forward();// to go forward on website

        driver.navigate().refresh();
        driver.navigate().to("https://www.google.com");
        // to get the title
       // System.out.println("driver.getTitle() = " + driver.getTitle());
        currentTitle=driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());


    }
}
