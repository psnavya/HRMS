package com.hrms.testautomation.stepDefinitions.leaves.general;

import com.hrms.testautomation.entities.EmployeeDetails;
import com.hrms.testautomation.utilities.cucumber.TestContext;
import com.hrms.testautomation.utilities.dataProviders.JsonDataReader;
import cucumber.api.java.en.Given;

public class JsonDataSteps {
    TestContext context;
    JsonDataReader jsonDataReader;
    EmployeeDetails employeeDetails;
    public  JsonDataSteps( TestContext context,EmployeeDetails employeeDetails) {
        this.context = context;
        this.employeeDetails=employeeDetails;
        jsonDataReader=context.getPageObjectManager().getJsonReader();
    }

    @Given("^i am user \"([^\"]*)\"$")
    public  void iAmUser(String arg1)  {
       /* EmployeeDetails employeeDetails=jsonDataReader.getEmployeeByName(arg1);

        jsonDataReader.setEmployeeName(employeeDetails);*/
        employeeDetails.setEmployeeName(arg1);

      /*  jsonDataReader.getCustomerByName("Jennifer Lawrence");
        jsonDataReader.getCustomerData().get(0);*/
    }
}
