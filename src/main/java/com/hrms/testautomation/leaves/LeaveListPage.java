package com.hrms.testautomation.leaves;

import com.hrms.testautomation.utilities.selenium.helpers.Click;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LeaveListPage {
    WebDriver driver;

    public LeaveListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
@FindBy(id="leaveList_chkSearchFilter_checkboxgroup_allcheck")
private WebElement allCheckBox;

    @FindBy(id="btnSearch")
    private WebElement searchButton;

    @FindBy(xpath="//td[4]")
    private List<WebElement> leaves;

    @FindBy(id="select_leave_action_67")
    private WebElement cancelButton;


    @FindBy(id="select_leave_action_67")
    private WebElement saveButton;
    public void selectOptionInLeaveList(String all) {
        Click.clickOn(allCheckBox);

    }

    public void clickSearchButton() {
        Click.clickOn(searchButton);
        driver.navigate().refresh();

    }

    public void cancelLeaves() {
        for(WebElement w:leaves) {
            if (w.getText().contains("-"))
                Click.clickOn(w);
                Click.clickOn(cancelButton);
        }
        Click.clickOn(saveButton);


    }
}
