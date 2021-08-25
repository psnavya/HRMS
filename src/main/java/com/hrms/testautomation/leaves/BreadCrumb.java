package com.hrms.testautomation.leaves;
import com.hrms.testautomation.utilities.selenium.Actions;
import com.hrms.testautomation.utilities.selenium.Click;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BreadCrumb {
    WebDriver driver;

    public BreadCrumb(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="menu_leave_viewLeaveModule")
    private WebElement viewLeaveModule;

    @FindBy(id="menu_leave_Entitlements")
    private WebElement entitlements;

    @FindBy(id="menu_leave_addLeaveEntitlement")
    private WebElement addLeaveEntitlement;

    @FindBy(id="menu_leave_assignLeave")
    private WebElement assignLeave;

    @FindBy(id="menu_leave_viewLeaveList")
    private WebElement viewLeaveList;

    public void hoverOnViewLeaveModule()
    {
        Actions.hoverOn(viewLeaveModule,driver);
    }
    public void hoverOneEntitlements()
    {
        Actions.hoverOn(entitlements,driver);
    }
    public void clickOnAddEntitlements()
    {
        Click.clickOn(addLeaveEntitlement);
    }
    public void clickOnAssignLeave()
    {
        Click.clickOn(assignLeave);
    }
    public void clickOnViewLeaveList()
    {
        Click.clickOn(viewLeaveList);
    }
}
