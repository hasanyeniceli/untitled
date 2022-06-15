package com.cydeo.test.day9_Javafaker_testbase_driverUtil;

public class Singleton {


    private Singleton(){}

    private static String word;
    public static String getword(){
        if (word==null){
            System.out.println("First tie cell. Word object is null");
            word="something";

        }else{
            System.out.println("word already hs value");

        }
        return word;

    }



/*
    @Test
    public void yte(){
        Driver.getDriver().get("https://www.google.com");
      WebElement gogl= Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        gogl.sendKeys("no"+ Keys.ENTER);


    }
*/
}
