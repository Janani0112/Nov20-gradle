package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;
class Employee_detail {
    private int id;
    private String name;
    private int age;
    private long phone;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
}
public class Employee {
    public static void main(String args[]) throws Exception {
        Employee_detail std = new Employee_detail();
        std.setId(001);
        std.setName("Janani");
        std.setAge(30);
        std.setPhone(9848022338L);
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(std);
        System.out.println(jsonString);
    }
}