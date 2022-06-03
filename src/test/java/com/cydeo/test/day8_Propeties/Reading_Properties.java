package com.cydeo.test.day8_Propeties;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Reading_Properties {
    @Test
    public void reading_from_properties_test() throws IOException {

        // 1-) First Create the object of Properties
        Properties properties=new Properties();
        // We need to open the file in the memory and get the path from Copy Root then choose content root
        FileInputStream file=new FileInputStream("configuration.properties");

        // Load the properties object using FileInputStream object
        properties.load(file);
        // Use the properties object to read the value
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"password\") = " + properties.getProperty("password"));



    }
}
