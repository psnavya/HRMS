package com.hrms.testautomation.leaves;

import com.hrms.testautomation.utilities.selenium.helpers.ClickClass;
import com.hrms.testautomation.utilities.selenium.helpers.SelectClass;
import com.hrms.testautomation.utilities.selenium.helpers.TextHandlingClass;
import com.hrms.testautomation.utilities.selenium.wrappers.ClickActions;
import com.hrms.testautomation.utilities.selenium.wrappers.SelectActions;
import com.hrms.testautomation.utilities.selenium.wrappers.TextHandlingActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class AssignLeavePage {
    WebDriver driver;
    ClickActions clickActions=new ClickClass();
    SelectActions selectActions=new SelectClass();
    TextHandlingActions textHandlingActions=new TextHandlingClass();
    public AssignLeavePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="assignleave_txtEmployee_empName")
    private WebElement employeeName;
    @FindBy(id="assignleave_txtLeaveType")
    private WebElement leaveType;
    @FindBy(id="assignleave_txtFromDate")
    private WebElement fromDate;
    @FindBy(id="assignleave_txtToDate")
    private WebElement toDate;
    @FindBy(id="assignBtn")
    private WebElement assignButton;

    @FindBy(id="confirmOkButton")
    private WebElement okButton;


    public void clickOKButton() {
        clickActions.clickOn(okButton);

    }

    public void enterEmployeeName(String jsonEmployeeName) {
        employeeName.sendKeys(jsonEmployeeName);
    }

    public void selectRandomLeaveType() {
        Random r=new Random();
        selectActions.selectIndexFromDropdown(r.ints(0,5).hashCode(),leaveType);
    }

    public void enterDateRange(String jsonFromDate, String jsonToDate) {

        textHandlingActions.enterText(jsonFromDate,fromDate);
        textHandlingActions.enterText(jsonToDate,toDate);
    }

    public void clickAssignButton() {
       clickActions.clickOn(assignButton);
    }
}
