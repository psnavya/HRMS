package com.hrms.testautomation.stepDefinitions.leaves;

import com.hrms.testautomation.leaves.LeaveEntitlementPage;
import com.hrms.testautomation.utilities.cucumber.TestContext;
import cucumber.api.java.en.When;

public class LeaveEntitlementPageSteps {
    TestContext context;
    LeaveEntitlementPage leaveEntitlementPage;

    public LeaveEntitlementPageSteps(TestContext context) {
        this.context = context;
        leaveEntitlementPage=context.getPageObjectManager().getLeaveEntitlementPage();
    }


    @When("^i enter employee name in leave entitlement page$")
    public void iEnterEmployeeNameInLeaveEntitlementPage()  {
        //send data from json
        leaveEntitlementPage.enterEmployeeName("jsonName");
    }

    @When("^i select leave type in leave entitlement page$")
    public void iSelectLeaveTypeInLeaveEntitlementPage()  {
        //send data from json
        leaveEntitlementPage.selectLeaveType("jsonLeaveType");
    }

    @When("^i enter entitlement in leave entitlement page$")
    public void iEnterEntitlementInLeaveEntitlementPage()  {
        //send data from json
        leaveEntitlementPage.enterEntitlement("jsonEntitlement");
    }

    @When("^i click Save button in leave entitlement page$")
    public void iClickSaveButtonInLeaveEntitlementPage() {
        leaveEntitlementPage.clickSaveButton();
    }

}
