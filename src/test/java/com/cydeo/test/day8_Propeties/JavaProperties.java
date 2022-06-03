package com.cydeo.test.day8_Propeties;

import org.testng.annotations.Test;

public class JavaProperties {


    @Test
    public void java_properties_readng_test(){
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
        System.out.println("System.getProperty(\"user.password\") = " + System.getProperty("user.password"));


    }
}
