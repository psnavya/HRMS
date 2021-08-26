package com.hrms.testautomation.stepDefinitions.leaves;

import com.hrms.testautomation.utilities.cucumber.TestContext;
import cucumber.api.java.en.When;
import com.hrms.testautomation.leaves.CartPage;

public class CartPageSteps {

    TestContext testContext;
    CartPage cartPage;

    public CartPageSteps(TestContext context) {
        testContext = context;
        cartPage = testContext.getPageObjectManager().getCartPage();
    }

    @When("^moves to checkout from mini cart$")
    public void moves_to_checkout_from_mini_cart(){
        cartPage.clickOn_Cart();
        cartPage.clickOn_ContinueToCheckout();
    }

}
