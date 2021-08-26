package com.hrms.testautomation.utilities.dataProviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.hrms.testautomation.utilities.enums.DriverType;
import com.hrms.testautomation.utilities.enums.EnvironmentType;

public class ConfigFileReader {

    private Properties properties;
    private final String propertyFilePath= "configs/Configuration.properties";
    private String projectPath;
    public ConfigFileReader(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }
    public String getProjectPath(){
        String projectPath;
        //Considering Mac/Windows
        if(System.getProperty("os.name").toLowerCase().contains("mac")) {
            projectPath=properties.getProperty("macDefaultPath");
        }
        else {
            projectPath=properties.getProperty("windowsDefaultPath");
        }
        if(projectPath!= null) return projectPath;
        else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");

    }

    public String getDriverPath(){
        String driverPath;
        //Considering Mac/Windows
        if(System.getProperty("os.name").toLowerCase().contains("mac")) {
            driverPath = getProjectPath()+properties.getProperty("macDriverPath");
        }
         else {
             projectPath=properties.getProperty("windowsDefaultPath");
            driverPath = getProjectPath()+properties.getProperty("windowsDriverPath");
        }
        if(driverPath!= null) return driverPath;
        else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");

    }

    public long getImplicitlyWait() {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
        else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
    }

    public String getApplicationUrl() {
        String url = properties.getProperty("url");
        if(url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }
    public DriverType getBrowser() {
        String browserName = properties.getProperty("browser");
        if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
        else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
        else if(browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
        else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
    }

    public EnvironmentType getEnvironment() {
        String environmentName = properties.getProperty("environment");
        if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
        else if(environmentName.equals("remote")) return EnvironmentType.REMOTE;
        else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
    }

    public Boolean getBrowserWindowSize() {
        String windowSize = properties.getProperty("windowMaximize");
        if(windowSize != null) return Boolean.valueOf(windowSize);
        return true;
    }
    public String getTestDataResourcePath(){
        String testDataResourcePath = properties.getProperty("testDataResourcePath");
        if(testDataResourcePath!= null) return testDataResourcePath;
        else throw new RuntimeException("Test Data Resource Path not specified in the Configuration.properties file for the Key:testDataResourcePath");
    }
    public String getReportConfigPath(){
        String reportConfigPath = properties.getProperty("reportConfigPath");
        if(reportConfigPath!= null) return reportConfigPath;
        else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }

}






