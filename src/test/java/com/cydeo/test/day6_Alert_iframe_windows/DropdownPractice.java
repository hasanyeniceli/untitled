package com.cydeo.test.day6_Alert_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractice {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //2. Go to https://practice.cydeo.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @AfterMethod
    public void teardown() {
        driver.close();
    }

    @Test
    public void dropdown_task5() throws InterruptedException {
        WebElement dropdown0 = driver.findElement(By.xpath("//select[@id='state']"));
        Select dropdown = new Select(dropdown0);
        Thread.sleep(2000);
        dropdown.selectByVisibleText("Illinois");
    }

    @Test
    public void dropdownTest2() throws InterruptedException {
        Select dropdown1 = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        Thread.sleep(1000);
        dropdown1.selectByValue("VA");

        //5. Select California

        Thread.sleep(3000);
        dropdown1.selectByIndex(5);

        //6. Verify final selected option is California.
        String expectedOptionText = "California";
        String actualOptionText = dropdown1.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText, expectedOptionText);
    }

    @Test
    public void dropdown_task6() throws InterruptedException {
        //Select “December 1 , 1923” and verify it is selected.
        Select yeardropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthdropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select daydropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

Thread.sleep(1500);
        yeardropdown.selectByVisibleText("1923");
        Thread.sleep(1000);
        monthdropdown.selectByValue("11");
        Thread.sleep(1000);
        daydropdown.selectByIndex(0);
    }
}