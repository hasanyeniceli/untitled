package com.cydeo.test.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG {
    @BeforeClass
    public void setupMehod(){
        System.out.println(" BeforeClass is Running just once before all the methods in the class ");
    }
    @AfterClass
    public void teardownMethod() {
        System.out.println(" AfterClass is Running just once after all the methods in the class ");
    }
    @BeforeMethod
        public void setUpMethod(){
        System.out.println("Beforemethod is running");
    }
    @AfterMethod
    public void tearDownMeMethod(){
        System.out.println("---> AfterMethod is running");
    }
    @Test
    public void test1() {
        System.out.println("test1 is running");
        // Assert Equals compares 2 of the same thing
        String actual="apple";
        String expected="apple";
        Assert.assertTrue(actual.equals(expected),"Faiing");

    }
    @Test
    public void test2() {
        System.out.println("test2 is running");
    }
}

