package org.example;

public class Company {
    private String companyName;
    private String employeename;
    private int employeeID;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getemployeename() {
        return employeename;
    }

    public void setemployeename(String employeename) {
        this.employeename = employeename;
    }

    public int getemployeeID() {
        return employeeID;
    }

    public void setemployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "[companyName " + companyName + ", Employee Name = " + employeename + ", Employee ID  = " + employeeID + "]";
    }
}