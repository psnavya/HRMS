package com.hrms.testautomation.leaves;

import com.hrms.testautomation.utilities.selenium.helpers.ClickClass;
import com.hrms.testautomation.utilities.selenium.helpers.SelectClass;
import com.hrms.testautomation.utilities.selenium.helpers.TextHandlingClass;
import com.hrms.testautomation.utilities.selenium.helpers.WaitClass;
import com.hrms.testautomation.utilities.selenium.wrappers.ClickActions;
import com.hrms.testautomation.utilities.selenium.wrappers.SelectActions;
import com.hrms.testautomation.utilities.selenium.wrappers.TextHandlingActions;
import com.hrms.testautomation.utilities.selenium.wrappers.WaitActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaveEntitlementPage {
WebDriver driver;
ClickActions clickActions=new ClickClass();
SelectActions selectActions=new SelectClass() ;
TextHandlingActions textHandlingActions=new TextHandlingClass();
WaitActions waitActions=new WaitClass();

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
        waitActions.waitForElementToAppear(employeeNameText,driver);
        textHandlingActions.enterText(employeeName,employeeNameText);
    }

    public void selectLeaveType(String leaveType) {
        clickActions.clickOn(leaveTypeSelect);
        selectActions.selectValueFromDropdown(leaveType,leaveTypeSelect);
    }

    public void enterEntitlement(String entitlement) {
        textHandlingActions.enterText(entitlement,entitlementText);
    }

    public void clickSaveButton() {
        clickActions.clickOn(saveButton);;
    }
}
