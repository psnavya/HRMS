package com.hrms.testautomation.stepDefinitions.leaves;

import com.hrms.testautomation.entities.EmployeeDetails;
import com.hrms.testautomation.entities.LeaveDetails;
import com.hrms.testautomation.leaves.LeaveEntitlementPage;
import com.hrms.testautomation.stepDefinitions.leaves.general.JsonDataSteps;
import com.hrms.testautomation.utilities.cucumber.TestContext;
import com.hrms.testautomation.utilities.dataProviders.JsonDataReader;
import com.hrms.testautomation.utilities.selenium.helpers.WaitClass;
import com.hrms.testautomation.utilities.selenium.wrappers.ClickActions;
import com.hrms.testautomation.utilities.selenium.wrappers.WaitActions;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.function.Function;

public class LeaveEntitlementPageSteps {
    TestContext context;
    LeaveEntitlementPage leaveEntitlementPage;
    EmployeeDetails employeeDetails;
    public LeaveEntitlementPageSteps(TestContext context,EmployeeDetails employeeDetails) {
        this.context = context;
        leaveEntitlementPage=context.getPageObjectManager().getLeaveEntitlementPage();
        this.employeeDetails=employeeDetails;

    }


    @When("^i enter employee name in leave entitlement page$")
    public void iEnterEmployeeNameInLeaveEntitlementPage() throws InterruptedException {
        //send data from json
        leaveEntitlementPage.enterEmployeeName(JsonDataSteps.testData.getEmployeeName());
    }

    @When("^i select leave type in leave entitlement page$")
    public void iSelectLeaveTypeInLeaveEntitlementPage()  {
        //send data from json

        leaveEntitlementPage.selectLeaveType(JsonDataSteps.testData.getLeaveDetails().getLeaveType());
    }

    @When("^i enter entitlement in leave entitlement page$")
    public void iEnterEntitlementInLeaveEntitlementPage()  {
        //send data from json
 /*       String s=context.getPageObjectManager().getJsonReader().getEmployeeDetailsData().stream().
                filter(x->x.employeeName.contains(context.getPageObjectManager().getJsonReader().getEmployeeName())).*/

        leaveEntitlementPage.enterEntitlement(Float.toString(JsonDataSteps.testData.getLeaveDetails().getEntitlement()));
    }

    @When("^i click Save button in leave entitlement page$")
    public void iClickSaveButtonInLeaveEntitlementPage() {
        leaveEntitlementPage.clickSaveButton();
    }

}
