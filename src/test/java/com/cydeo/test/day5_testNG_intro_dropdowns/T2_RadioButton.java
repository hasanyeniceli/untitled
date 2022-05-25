package com.cydeo.test.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_RadioButton {
    public static void main(String[] args) {
        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement radioButtonBlue=driver.findElement(By.cssSelector("input[id='blue']"));
        System.out.println("radioButtonBlue.isDisplayed() = " + radioButtonBlue.isDisplayed());
        System.out.println("radioButtonBlue.isSelected() = " + radioButtonBlue.isSelected());
        WebElement radioButtonRed=driver.findElement(By.cssSelector("input[id='red']"));
        System.out.println("radioButtonRed.isDisplayed() = " + radioButtonRed.isDisplayed());
        System.out.println("radioButtonRed.isSelected() = " + radioButtonRed.isSelected());
        WebElement radioButtonYellow=driver.findElement(By.cssSelector("input[id='yellow']"));
        System.out.println("radioButtonYellow.isDisplayed() = " + radioButtonYellow.isDisplayed());
        System.out.println("radioButtonYellow.isSelected() = " + radioButtonYellow.isSelected());
        WebElement radioButtonBlack=driver.findElement(By.cssSelector("input[id='black']"));
        System.out.println("radioButtonBlack.isDisplayed() = " + radioButtonBlack.isDisplayed());
        System.out.println("radioButtonBlack.isSelected() = " + radioButtonBlack.isSelected());
        WebElement radioButtonGreen=driver.findElement(By.cssSelector("input[id='green']"));
        System.out.println("radioButtonGreen.isDisplayed() = " + radioButtonGreen.isDisplayed());
        System.out.println("radioButtonGreen.isSelected() = " + radioButtonGreen.isSelected());
        System.out.println("radioButtonGreen.isEnabled() = " + radioButtonGreen.isEnabled());
        System.out.println("----------------------------------------------------------------------");

        WebElement radioButtonHockey=driver.findElement(By.xpath("//input[@id='hockey']"));
        radioButtonHockey.click();

        if (radioButtonHockey.isSelected()){
            System.out.println("Verification Pass Hockey Selected");

        }else{
            System.out.println("Verification Failed Hockey is Not Selected");
        }
    }
}
