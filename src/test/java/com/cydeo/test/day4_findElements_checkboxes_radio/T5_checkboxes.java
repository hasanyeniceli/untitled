package com.cydeo.test.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/checkboxes");

        //We have to locate checkboxes
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));
        //2. Confirm checkbox #1 is NOT selected by default. We are expecting "FALSE"
        System.out.println("checkbox1.isSelected() Expected False =  " + checkbox1.isSelected());
        //3. Confirm checkbox #2 is SELECTED by default.Expected TRUE
        System.out.println("checkbox2.isSelected()   Expected TRUE = Expected TRUE " + checkbox2.isSelected());

        //  4. Click checkbox #1 to select it.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        checkbox1.click();

        //5. Click checkbox #2 to deselect it.
        Thread.sleep(2000);
        checkbox2.click();
        if (checkbox1.isSelected()) {
            System.out.println("checkbox1 = " + checkbox1.isSelected());
        } else {

            System.out.println("verification fail");
        }

        if (!checkbox2.isSelected()) {
         System.out.println("verification passed");
            }else{
            System.out.println("verification fail");
        }

        }
    }
