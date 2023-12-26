package org.example.spring.xmlBasedDI;

import org.springframework.stereotype.Component;

import java.util.List;


public class Employee {
    private int employeeId;
    private String employeeName;
    private List<String> contactNumbers;
    private Address address;

    public Employee() {
        super();
        System.out.println("Employee -- Default Constructor called");
    }

    public Employee(int employeeId, String employeeName, List<String> contactNumbers, Address address) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.contactNumbers = contactNumbers;
        this.address = address;
        System.out.println("Employee -- Parametrized Constructor called");
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        System.out.println("Setter - EmployeeID");
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        System.out.println("Setter - EmployeeName");
        this.employeeName = employeeName;
    }

    public List<String> getContactNumbers() {
        return contactNumbers;
    }

    public void setContactNumbers(List<String> contactNumbers) {
        System.out.println("Setter - ContactNos.");
        this.contactNumbers = contactNumbers;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setter - Address");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", contactNumbers=" + contactNumbers +
                ", address='" + address + '\'' +
                '}';
    }
}
