package com.hrms.testautomation.leaves;

import com.hrms.testautomation.utilities.selenium.Actions;
import com.hrms.testautomation.utilities.selenium.Click;
import com.hrms.testautomation.utilities.selenium.Select;
import com.hrms.testautomation.utilities.selenium.TextHandling;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class AssignLeavePage {
    WebDriver driver;

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
        Click.clickOn(okButton);

    }

    public void enterEmployeeName(String jsonEmployeeName) {
        employeeName.sendKeys(jsonEmployeeName);
    }

    public void selectRandomLeaveType() {
        Random r=new Random();
        Select.selectIndexFromDropdown(r.ints(0,5).hashCode(),leaveType);
    }

    public void enterDateRange(String jsonFromDate, String jsonToDate) {
        TextHandling.enterText(jsonFromDate,fromDate);
        TextHandling.enterText(jsonToDate,toDate);
    }

    public void clickAssignButton() {
        Click.clickOn(assignButton);
    }
}
