package com.hrms.testautomation.stepDefinitions.leaves;

import org.junit.Assert;

import com.hrms.testautomation.utilities.cucumber.TestContext;
import cucumber.api.java.en.Then;
import com.hrms.testautomation.utilities.enums.Context;
import com.hrms.testautomation.leaves.ConfirmationPage;

public class ConfirmationPageSteps {
    TestContext testContext;
    ConfirmationPage confirmationPage;

    public ConfirmationPageSteps(TestContext context) {
        testContext = context;
        confirmationPage = testContext.getPageObjectManager().getConfirmationPage();
    }

    @Then("^verify the order details$")
    public void verify_the_order_details(){
        String productName = (String)testContext.scenarioContext.getContext(Context.PRODUCT_NAME);
        //Below will pass
        Assert.assertTrue(confirmationPage.getProductNames().stream().filter(x -> x.contains(productName)).findFirst().get().length()>0);
        /*Below will fail and screenshots folder will be updated in cucumber-reports
        Assert.assertTrue(confirmationPage.getProductNames().stream().filter(x -> x.contains(productName)).findFirst().get().length()== 0);

        or you can also add message to Asserts, that will display in case of failure only:

        Assert.assertTrue(productName + " : is not found on " + confirmationPage.getProductNames().toString(), confirmationPage.getProductNames().stream().filter(x -> x.contains(productName)).findFirst().get().length()==0);
*/
    }

}
