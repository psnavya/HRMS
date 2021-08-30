package com.hrms.testautomation.stepDefinitions.leaves;

import com.hrms.testautomation.entities.EmployeeDetails;
import com.hrms.testautomation.leaves.LeaveListPage;
import com.hrms.testautomation.utilities.cucumber.TestContext;
import cucumber.api.java.en.When;

public class LeaveListPageSteps {
    TestContext context;
    LeaveListPage leaveListPage;
    EmployeeDetails employeeDetails;

    public LeaveListPageSteps(TestContext context,EmployeeDetails employeeDetails) {
        this.context = context;
        leaveListPage=context.getPageObjectManager().getLeaveListPage();
        this.employeeDetails=employeeDetails;
    }

    @When("^i select all checkbox in leave list page$")
    public void iSelectAllCheckboxInLeaveListPage(){
       leaveListPage.selectOptionInLeaveList("All");
    }

    @When("^i click Search button in leave list page$")
    public void iClickSearchButtonInLeaveListPage()  {
       leaveListPage.clickSearchButton();

    }

    @When("^i cancel leave in case of insufficient balance$")
    public void iCancelLeaveInCaseOfInsufficientBalance()  {
        leaveListPage.cancelLeaves();

    }


}
