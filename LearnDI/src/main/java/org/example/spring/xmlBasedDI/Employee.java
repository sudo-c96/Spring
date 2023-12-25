package org.example.spring.xmlBasedDI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Component
public class Employee {
    private int employeeId;
    private int employeeName;

    private String address;

    public Employee() {
    }

    public Employee(int employeeId, int employeeName, String address) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.address = address;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(int employeeName) {
        this.employeeName = employeeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }







    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName=" + employeeName +
                ", address='" + address + '\'' +
                '}';
    }
}
