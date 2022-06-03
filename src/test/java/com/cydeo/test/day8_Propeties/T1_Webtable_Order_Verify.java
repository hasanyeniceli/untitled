package com.cydeo.test.day8_Propeties;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTablesUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Webtable_Order_Verify {
public WebDriver driver;

@BeforeMethod
  public void setup() {
      driver = WebDriverFactory.getDriver("chrome");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://practice.cydeo.com/web-tables");

  }

  @Test
  public void order_name_verify(){
      // locate the cell mob mardin

        WebElement bobMartinCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
      // verify the name match
            String actualbobMrding=bobMartinCell.getText();
           System.out.println("bobMartinCell.getText() = " + bobMartinCell.getText());
           String expectedbob="Bob Martin";

      Assert.assertEquals(actualbobMrding,expectedbob);
      WebElement boborderdate=driver.findElement(By.xpath("//td[.='Bob Martin']/following-sibling::td[3]"));
      System.out.println("boborderdate.getText() = " + boborderdate.getText());
      String expectedBobDate = "12/31/2021";
      String actualBobDate =boborderdate.getText();

      Assert.assertEquals(actualBobDate, expectedBobDate);
  }

  @Test
    public void orderdate(){
      String customerOrderdate= WebTablesUtils.returnOrderdate(driver,"Alexandra Gray");
      System.out.println("customerOrderdate = " + customerOrderdate);

  }
@Test
    public void test3(){
    WebTablesUtils.orderverify(driver,"Bart Fisher","01/16/2021");
WebElement checbutton= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_orderGrid_ctl02_OrderSelector']"));
    System.out.println(checbutton.isSelected());
    checbutton.click();
    checbutton.isEnabled();
}
}
