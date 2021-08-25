package com.hrms.testautomation.leaves;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
        employeeNameText.sendKeys(employeeName);
    }

    public void selectLeaveType(String leaveType) {
        Select select=new Select(leaveTypeSelect);
        select.selectByValue(leaveType);
    }

    public void enterEntitlement(String entitlement) {
        entitlementText.sendKeys(entitlement);
    }

    public void clickSaveButton() {
        saveButton.click();
    }
}
