package com.hrms.testautomation.stepDefinitions.leaves;

import com.hrms.testautomation.leaves.LoginPage;
import com.hrms.testautomation.utilities.cucumber.TestContext;
import cucumber.api.java.en.Given;

public class LoginPageSteps {
    TestContext testContext;
    LoginPage loginPage;

    public LoginPageSteps(TestContext context) {
        this.testContext = context;
        loginPage=testContext.getPageObjectManager().getLoginPage();
    }

    @Given("^i log in with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLogInWithUsernameAndPassword(String arg0, String arg1) throws Throwable {

        loginPage.enterUsername(arg0);
        loginPage.enterPassword(arg1);
        loginPage.clickLoginButton();
    }
}
