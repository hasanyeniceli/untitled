package com.cydeo.test.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_cont {
    public static void main(String[] args) {

        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //Locate name='sports' radio buttons and store them in a List of Web Element
        clickAndVerifyRadioButton(driver, "sport", "hockey");


        List<WebElement> sportRadioButton = driver.findElements(By.name("sport"));

        for (WebElement each : sportRadioButton) {
            String eachID = each.getAttribute("id");
            System.out.println("eachID = " + eachID);
            if (eachID.equals("hockey")) {
                each.click();
                System.out.println("Hockey is Selected" + each.isSelected());
                break;
            }
        }
    }

        private static void clickAndVerifyRadioButton(WebDriver driver,String nameAttribute, String idvalue ){
        List<WebElement> radiobuttonlist=driver.findElements(By.name(nameAttribute));

        for (WebElement each: radiobuttonlist){
            String eachId=each.getAttribute("id");
            if (eachId.equals(idvalue)){
                each.click();
                System.out.println(eachId + " is selected :" +each.isSelected() );
                break;
            }
        }



    }
}