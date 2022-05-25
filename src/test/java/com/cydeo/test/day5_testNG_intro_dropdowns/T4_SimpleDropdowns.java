package com.cydeo.test.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdowns {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        //Do browser driver setup
        //Open browser
        driver = WebDriverFactory.getDriver("chrome");

        //Maximize the page
        driver.manage().window().maximize();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }
    @Test
    public void simpleDropdowntest(){
        Select selectdata= new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currenlySelectedElement= selectdata.getFirstSelectedOption();
        String actualSimpleDropdown=currenlySelectedElement.getText();
        String expectedSimpleDropdown="Please select an option";

        //Expected: “Please select an option”
        Assert.assertEquals(actualSimpleDropdown,expectedSimpleDropdown);

        //4. Verify “State selection” default selected value is correct
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //Expected: “Select a State”
        String expectedStateDropdownText = "Select a State";

        String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText(); // to find an element
   //   put the element to string than use select object tanh use getfirst method to find the element than use gettext to find the text
        Assert.assertEquals(actualStateDropdownText, expectedStateDropdownText); // check it

        //Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(), "Select a State");

    }

}
