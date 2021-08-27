package com.hrms.testautomation.leaves;
import com.hrms.testautomation.utilities.selenium.helpers.HoverClass;
import com.hrms.testautomation.utilities.selenium.wrappers.ClickActions;
import com.hrms.testautomation.utilities.selenium.wrappers.HoverActions;
import com.hrms.testautomation.utilities.selenium.helpers.ClickClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BreadCrumb {
    WebDriver driver;
    ClickActions clickActions=new ClickClass();
    HoverActions hoverActions=new HoverClass();

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
        hoverActions.hoverOn(viewLeaveModule,driver);


    }
    public void hoverOneEntitlements()
    {
        hoverActions.hoverOn(entitlements,driver);
    }
    public void clickOnAddEntitlements()
    {
        clickActions.clickOn(addLeaveEntitlement);
    }
    public void clickOnAssignLeave()
    {
        clickActions.clickOn(assignLeave);
    }
    public void clickOnViewLeaveList()
    {
        clickActions.clickOn(viewLeaveList);
    }
}
