package com.cydeo.test.day7_webtables_utilities_javafaker;

import com.cydeo.test.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRM_LOGIN extends TestBase {


    //TC #3: Login scenario
    @Test
    public void crm_login_test() {

        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3. Enter valid username


    WebElement inputUserName= driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));

    inputUserName.sendKeys("helpdesk1@cybertekschool.com");

    WebElement inputUserPassword= driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
    inputUserPassword.sendKeys("UserUser");

    WebElement loginbutton=driver.findElement(By.xpath("//input[@value='Log In']"));
    loginbutton.click();
        BrowserUtils.verifyTitle(driver,"Portal");

}
    @Test
    public void crm_login_test_2() {

        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        CRM_Utilities.crm_login(driver);


    }
    @Test
    public void crm_login_test_3(){
        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver,"helpdesk2@cybertekschool.com","UserUser");

        BrowserUtils.sleep(10);

        BrowserUtils.verifyTitle(driver,"(2) Portal");

    }
}