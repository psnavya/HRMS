package com.hrms.testautomation.leaves;

import com.hrms.testautomation.utilities.selenium.helpers.Click;
import com.hrms.testautomation.utilities.selenium.helpers.Select;
import com.hrms.testautomation.utilities.selenium.helpers.TextHandling;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaveEntitlementPage {
WebDriver driver;

    public LeaveEntitlementPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="entitlements_employee_empName")
    private WebElement employeeNameText;

    @FindBy(id="entitlements_leave_type")
    private WebElement leaveTypeSelect;

    @FindBy(id="entitlements_entitlement")
    private WebElement entitlementText;

    @FindBy(id="btnSave")
    private WebElement saveButton;

    public void enterEmployeeName(String employeeName) {
        TextHandling.enterText(employeeName,employeeNameText);
    }

    public void selectLeaveType(String leaveType) {
        Select.selectValueFromDropdown(leaveType,leaveTypeSelect);
    }

    public void enterEntitlement(String entitlement) {
        TextHandling.enterText(entitlement,entitlementText);
    }

    public void clickSaveButton() {
        Click.clickOn(saveButton);;
    }
}
