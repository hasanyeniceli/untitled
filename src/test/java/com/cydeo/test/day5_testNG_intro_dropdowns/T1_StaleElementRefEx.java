package com.cydeo.test.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefEx {
    public static void main(String[] args) {

    WebDriver driver = WebDriverFactory.getDriver("Chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("https://practice.cydeo.com/add_remove_elements/");
        WebElement addButton=driver.findElement(By.xpath("//button[@onclick='addElement()']"));

        addButton.click();

        System.out.println("addButton.isDisplayed() = " + addButton.isDisplayed());

        WebElement deleteButton=driver.findElement(By.xpath("//button[@class='added-manually']"));
        deleteButton.click();
         // after we click the delete button it disappeared
        // because of that it gives StaleElementReferenceException -- it means element is no longer on the webside anymore to solve this exception we use try and catch method
        try {
            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        }catch (StaleElementReferenceException e){
            System.out.println(" StaleElementReferenceException is thrown");
            System.out.println("-->This means the web element is completely deleted from the pag");
            System.out.println("deleteButton.isDisplayed() = false");
        }



    }
}
