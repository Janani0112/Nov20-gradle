package org.example;
import com.google.gson.Gson;
public class Main {
    public static Company getCompanyData(Company company) {
        company.setCompanyName("Accolite");
        company.setemployeename("Janani");
        company.setemployeeID(1000);
        return company;
    }
    public static void main(String[] args) {
        Company company = new Company();
        company = getCompanyData(company);
        System.out.println("The JSON representation of Object company is ");
        System.out.println(new Gson().toJson(company));

    }
}