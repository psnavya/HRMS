package com.hrms.testautomation.utilities.dataProviders;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
//import com.google.gson.Gson;
import com.hrms.testautomation.entities.EmployeeDetails;
import gherkin.deps.com.google.gson.Gson;
import com.hrms.testautomation.utilities.managers.FileReaderManager;
import com.hrms.testautomation.entities.Customer;
public class JsonDataReader {
    private final String employeeDetailsFilePath = FileReaderManager.getInstance().getConfigReader().getTestDataResourcePath() + "leaveDetails.json";
    private List<Customer> customerList;
    private List<EmployeeDetails> employeeDetailsList;
    private EmployeeDetails employeeDetails;

    public JsonDataReader(){
        customerList = getCustomerData();
        employeeDetailsList=getEmployeeDetailsData();
        employeeDetails=new EmployeeDetails();
    }

    public List<Customer> getCustomerData() {
        Gson gson = new Gson();
        BufferedReader bufferReader = null;
        try {
            bufferReader = new BufferedReader(new FileReader(employeeDetailsFilePath));
            Customer[] customers = gson.fromJson(bufferReader, Customer[].class);
            return Arrays.asList(customers);
        }catch(FileNotFoundException e) {
            throw new RuntimeException("Json file not found at path : " + employeeDetailsFilePath);
        }finally {
            try { if(bufferReader != null) bufferReader.close();}
            catch (IOException ignore) {}
        }
    }

    public List<EmployeeDetails> getEmployeeDetailsData() {
        Gson gson = new Gson();
        BufferedReader bufferReader = null;
        try {
            bufferReader = new BufferedReader(new FileReader(employeeDetailsFilePath));
            EmployeeDetails[] employeeDetails = gson.fromJson(bufferReader, EmployeeDetails[].class);
            return Arrays.asList(employeeDetails);
        }catch(FileNotFoundException e) {
            throw new RuntimeException("Json file not found at path : " + employeeDetailsFilePath);
        }finally {
            try { if(bufferReader != null) bufferReader.close();}
            catch (IOException ignore) {}
        }
    }

    public final Customer getCustomerByName(String customerName){
        return customerList.stream().filter(x -> x.firstName.equalsIgnoreCase(customerName)).findAny().get();

    }
    public final EmployeeDetails getEmployeeByName(String customerName){
        return employeeDetailsList.stream().filter(x -> x.employeeName.equalsIgnoreCase(customerName)).findAny().get();

    }
/*
    public void setEmployeeName(EmployeeDetails employeeDetails) {
        this.employeeDetails=employeeDetails;
    }
    public String getEmployeeName() {
        return employeeDetails.employeeName;
    }*/
   /* public final Customer getCustomerByName(String customerName){
        for(Customer customer : customerList) {
            if(customer.firstName.equalsIgnoreCase(customerName)) return customer;
        }
        return null;
    }*/


}
