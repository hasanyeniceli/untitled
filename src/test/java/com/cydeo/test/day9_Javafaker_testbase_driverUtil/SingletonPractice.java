package com.cydeo.test.day9_Javafaker_testbase_driverUtil;

import org.testng.annotations.Test;

public class SingletonPractice {
    @Test(priority = 2)
    public void singleton_understand_test(){
        String str1=Singleton.getword();
        System.out.println("str1 = " + str1);

        String str2=Singleton.getword();
        System.out.println("str2 = " + str2);

        String str3=Singleton.getword();
        System.out.println("str3 = " + str2);

    }
    @Test(priority = 1)
    public void singleton_understand_test2(){
        String str4=Singleton.getword();
        System.out.println("str4 = " + str4);

    }
}
