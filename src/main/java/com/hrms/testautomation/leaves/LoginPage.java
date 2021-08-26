package com.hrms.testautomation.leaves;

import com.hrms.testautomation.utilities.selenium.helpers.TextHandling;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="txtUsername")
    private WebElement userNameText;

    @FindBy(id="txtPassword")
    private WebElement passwordText;

    @FindBy(id="btnLogin")
    private WebElement loginButton;

    public void enterUsername(String userName) {
        TextHandling.enterText(userName,userNameText);
    }

    public void enterPassword(String password) {
        TextHandling.enterText(password,passwordText);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
