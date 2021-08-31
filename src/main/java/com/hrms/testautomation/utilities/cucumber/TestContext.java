package com.hrms.testautomation.utilities.cucumber;

import com.hrms.testautomation.entities.EmployeeDetails;
import com.hrms.testautomation.utilities.dataProviders.JsonDataReader;
import com.hrms.testautomation.utilities.managers.PageObjectManager;
import com.hrms.testautomation.utilities.managers.WebDriverManager;

public class TestContext {
    private WebDriverManager webDriverManager;
    private PageObjectManager pageObjectManager;
    public ScenarioContext scenarioContext;
    public EmployeeDetails employeeDetails;

    public TestContext(){
        webDriverManager = new WebDriverManager();
        employeeDetails=new EmployeeDetails();
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
        scenarioContext = new ScenarioContext();
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    public ScenarioContext getScenarioContext() {
        return scenarioContext;
    }

}
