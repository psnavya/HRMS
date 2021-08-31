package com.hrms.testautomation.utilities.managers;



import com.hrms.testautomation.entities.EmployeeDetails;
import com.hrms.testautomation.leaves.*;
import com.hrms.testautomation.utilities.dataProviders.JsonDataReader;
import org.openqa.selenium.WebDriver;


public class PageObjectManager {

    private WebDriver driver;

    private ProductListingPage productListingPage;

    private CartPage cartPage;

    private HomePage homePage;

    private CheckoutPage checkoutPage;

    private ConfirmationPage confirmationPage;


    private LoginPage loginPage;
    private BreadCrumb breadCrumb;
    private LeaveEntitlementPage leaveEntitlementPage;
    private  LeaveListPage leaveListPage;
    private  AssignLeavePage assignLeavePage;
    private  JsonDataReader jsonDataReader;


    public PageObjectManager(WebDriver driver) {

        this.driver = driver;

    }



    public HomePage getHomePage(){

        return (homePage == null) ? homePage = new HomePage(driver) : homePage;

    }



    public ProductListingPage getProductListingPage() {

        return (productListingPage == null) ? productListingPage = new ProductListingPage(driver) : productListingPage;

    }



    public CartPage getCartPage() {

        return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;

    }



    public CheckoutPage getCheckoutPage() {

        return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;

    }

    public ConfirmationPage getConfirmationPage() {
        return (confirmationPage == null) ? confirmationPage = new ConfirmationPage(driver) : confirmationPage;
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;

    }

    public BreadCrumb getBreadCrumb() {
        return (breadCrumb == null) ? breadCrumb = new BreadCrumb(driver) : breadCrumb;

    }

    public LeaveEntitlementPage getLeaveEntitlementPage() {
        return (leaveEntitlementPage==null)?leaveEntitlementPage=new LeaveEntitlementPage(driver):leaveEntitlementPage;
    }

    public LeaveListPage getLeaveListPage() {
        return (leaveListPage==null)? leaveListPage=new LeaveListPage(driver):leaveListPage;
    }

    public AssignLeavePage getAssignLeavePage() {
        return (assignLeavePage==null)?assignLeavePage=new AssignLeavePage(driver):assignLeavePage;
    }

   public JsonDataReader getJsonReader() {
        return (jsonDataReader==null)?jsonDataReader=new JsonDataReader():jsonDataReader;
    }
}
