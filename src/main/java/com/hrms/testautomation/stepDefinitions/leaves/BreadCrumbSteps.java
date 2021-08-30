package com.hrms.testautomation.stepDefinitions.leaves;

import com.hrms.testautomation.leaves.BreadCrumb;
import com.hrms.testautomation.utilities.cucumber.TestContext;
import com.hrms.testautomation.utilities.dataProviders.JsonDataReader;
import cucumber.api.java.en.When;

public class BreadCrumbSteps {
TestContext context;
BreadCrumb breadCrumb;
    public BreadCrumbSteps( TestContext context) {
        this.context = context;
        breadCrumb=context.getPageObjectManager().getBreadCrumb();
    }


    @When("^i navigate to add leave entitlement tab$")
    public void iNavigateToAddLeaveEntitlementTab()  {

        breadCrumb.hoverOnViewLeaveModule();
        breadCrumb.hoverOneEntitlements();
        breadCrumb.clickOnAddEntitlements();
    }

    @When("^i navigate to assign leave tab$")
    public void iNavigateToAssignLeaveTab() {
        breadCrumb.hoverOnViewLeaveModule();
        breadCrumb.clickOnAssignLeave();
    }

    @When("^i navigate to view leave list tab$")
    public void iNavigateToViewLeaveListTab()  {
        breadCrumb.hoverOnViewLeaveModule();
        breadCrumb.clickOnViewLeaveList();
    }
}
