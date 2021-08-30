package com.hrms.testautomation.stepDefinitions.leaves;

import com.hrms.testautomation.entities.EmployeeDetails;
import com.hrms.testautomation.leaves.AssignLeavePage;
import com.hrms.testautomation.utilities.cucumber.TestContext;
import cucumber.api.java.en.When;

public class AssignLeavePageSteps {
    TestContext context;
    AssignLeavePage assignLeavePage;
    EmployeeDetails employeeDetails;

    public AssignLeavePageSteps(TestContext context,EmployeeDetails employeeDetails) {
        this.context = context;
        assignLeavePage=context.getPageObjectManager().getAssignLeavePage();
        this.employeeDetails=employeeDetails;
    }

    @When("^i click OK button in Confirm Leave assignment popup$")
    public void i_click_OK_button_in_Confirm_Leave_assignment_popup() throws Throwable {
        assignLeavePage.clickOKButton();
    }


    @When("^i enter employee name in assign leave page$")
    public void i_enter_employee_name_in_assign_leave_page() throws Throwable {
        assignLeavePage.enterEmployeeName("jsonEmployeeName");
    }

    @When("^i select random leave type in assign leave page$")
    public void i_select_random_leave_type_in_assign_leave_page() throws Throwable {
       assignLeavePage.selectRandomLeaveType();
    }

    @When("^i enter date range in assign leave page$")
    public void i_enter_date_range_in_assign_leave_page() throws Throwable {
       assignLeavePage.enterDateRange("jsonFromDate","jsonToDate");
    }

    @When("^i click Assign button in assign leave page$")
    public void i_click_Assign_button_in_assign_leave_page() throws Throwable {
       assignLeavePage.clickAssignButton();
    }


}
