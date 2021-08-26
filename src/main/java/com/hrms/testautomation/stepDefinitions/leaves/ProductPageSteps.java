package com.hrms.testautomation.stepDefinitions.leaves;

import com.hrms.testautomation.leaves.ProductListingPage;
import com.hrms.testautomation.utilities.cucumber.TestContext;
import com.hrms.testautomation.utilities.enums.Context;
import cucumber.api.java.en.When;

public class ProductPageSteps {

    TestContext testContext;
    ProductListingPage productListingPage;

    public ProductPageSteps(TestContext context) {
        testContext = context;
        productListingPage = testContext.getPageObjectManager().getProductListingPage();
    }

    @When("^choose to buy the first item$")
    public void choose_to_buy_the_first_item() {
        String productName = productListingPage.getProductName(0);
        testContext.scenarioContext.setContext(Context.PRODUCT_NAME, productName);

        productListingPage.select_Product(0);
        productListingPage.clickOn_AddToCart();
    }
}
