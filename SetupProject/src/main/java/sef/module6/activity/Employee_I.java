package sef.module6.activity;
public class Employee_I extends Person_I {
    private double salary;
    private String title;
    public Employee_I() {
        super(); // Calls Person_I() constructor
        this.salary = 0.0;
        this.title = "Unassigned";
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}