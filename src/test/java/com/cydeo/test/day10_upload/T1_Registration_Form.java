package com.cydeo.test.day10_upload;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_Registration_Form {
    @Test
    public void registration_fron_test(){
        Faker faker = new Faker();

        Driver.getDriver().get(ConfigurationReader.getproperty("registration.from.url"));

        WebElement inputName=Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));

inputName.sendKeys(faker.name().firstName());
        WebElement lastName=Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());
            String user=faker.bothify("helpdesk###");
        WebElement userName=Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys(user);

        WebElement email=Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(user+"@email.com");

        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.numerify("########"));

        WebElement phonemuber=Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phonemuber.sendKeys(faker.numerify("###-###-####"));

        WebElement femaleGender=Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
            femaleGender.click();



    }

}
