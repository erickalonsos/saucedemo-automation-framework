package com.erick.framework.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {

    public String configReader(String property) throws IOException {

        Properties properties = new Properties();

        properties.load(new FileInputStream("src/resources/config.properties"));

        String strPropery = properties.getProperty(property).toString();

        return strPropery;


    }

}
