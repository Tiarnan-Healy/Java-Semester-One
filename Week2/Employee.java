package Week2;
import java.time.*;

public class Employee {
    // datetime configuration


    // Employee attributes
    private String name;
    private int age;
    private double salary;
    private double hours;
    private String role;
    private String department;
    private LocalDate startDate;
    private int ID;

    // constructor
    public Employee(String name, int age, double salary, double hours, String role, String department, int year, int month, int dayOfMonth, int ID) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hours = hours;
        this.role = role;
        this.department = department;
        this.startDate = LocalDate.of(year, month, dayOfMonth);
        this.ID = ID;
    }

    // getters
    public String getName() {return name;}
    public int getAge() {return age;}
    public double getSalary() {return salary;}
    public double getHours() {return hours;}
    public String getRole() {return role;}
    public String getDepartment() {return department;}
    public LocalDate getStartDate() {return startDate;}
    public int getID() {return ID;}

    // setters
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public void setSalary(double salary) {this.salary = salary;}
    public void setHours(double hours) {this.hours = hours;}
    public void setRole(String role) {this.role = role;}
    public void setDepartment(String department) {this.department = department;}
    public void setStartDate(LocalDate startDate) {this.startDate = startDate;}
    public void setID(int ID) {this.ID = ID;}
}
