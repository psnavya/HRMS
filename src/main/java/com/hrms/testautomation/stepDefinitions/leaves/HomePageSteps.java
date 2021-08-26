package com.hrms.testautomation.stepDefinitions.leaves;

import com.cucumber.listener.Reporter;
import com.hrms.testautomation.utilities.cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import com.hrms.testautomation.leaves.HomePage;

public class HomePageSteps {

    TestContext testContext;
    HomePage homePage;

    public HomePageSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("^user is on Home Page$")
    public void user_is_on_Home_Page(){
        homePage.navigateTo_HomePage();
    }

    @When("^he search for \"([^\"]*)\"$")
    public void he_search_for(String product)  {
        homePage.perform_Search(product);
       /* Add Logging to your Reports
        User can add logs at any step and those logs will be captured and attached to the corresponding step. The log should be added as follows:

        Reporter.addStepLog("Step Log message goes here");

        In case any log to be added at the scenario level, the following can be done:

        Reporter.addScenarioLog("Scenario Log message goes here");

        It's a static class, so feel free to use this Reporter class to anywhere in the project.

*/
        Reporter.addStepLog("Step Log message goes here");
        Reporter.addScenarioLog("Scenario Log message goes here");


    }

}
