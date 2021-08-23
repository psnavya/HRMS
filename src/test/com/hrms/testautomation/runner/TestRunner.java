package com.hrms.testautomation.runner;

import java.io.*;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.hrms.testautomation.utilities.managers.FileReaderManager;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/com/hrms/testautomation/resources/features",
        glue= {"stepDefinitions"},
        /* plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
           "junit:target/cucumber-reports/Cucumber.xml",
                 "html:target/cucumber-reports"},*/
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        monochrome = true
)
public class TestRunner {

    @AfterClass
    public static void writeExtentReport()  {
        Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", 	System.getProperty("os.name")+" "+System.getProperty("os.arch")+" "+System.getProperty("os.version"));
         Reporter.setSystemInfo("Environment", FileReaderManager.getInstance().getConfigReader().getEnvironment().toString());
        Reporter.setSystemInfo("Browser",FileReaderManager.getInstance().getConfigReader().getBrowser().toString() );
    }


}

