package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Yahoo_Test_TitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yahoo.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        String actualtitle=driver.getTitle();
        String expectedTitle="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        if (actualtitle.equals(expectedTitle)){
            System.out.println("Expected result- Passed");
        }else{
            System.out.println("Not Expected - Failed");
        }
        driver.close();
    }
}
// Expected : Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos