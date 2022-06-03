package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    // 1-) First Create the object of Properties
    private static Properties properties = new Properties();

    static {
        try {
            // We need to open the file in the memory and get the path from Copy Root then choose content root
            FileInputStream file = new FileInputStream("configuration.properties");

            // Load the properties object using FileInputStream object
            properties.load(file);
            //close the file
            file.close();
        } catch (IOException e) {
            System.out.println("File Not Found in the Configuration Reader");
            e.printStackTrace();

        }

    }
public static String getproperty(String keyword){
        return properties.getProperty(keyword);

}
}
