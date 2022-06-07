package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;

public class Driver {

    /*
    Creating a private constructor, so we are closing
    access to the object of this class from outside the class
     */

    private Driver(){


    }


    private  static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver==null){

        }

        return driver;

    }

}
