package sef.module6.activity;
public class InheritanceActivity {
    public static void main(String[] args) {
        Person_I p = new Person_I();
        p.setName("Sarah Johnson");
        p.setAge(21);
        Employee_I e = new Employee_I();
        e.setName("John Doe");
        e.setAge(30);
        e.setSalary(70000);
        e.setTitle("QA Automation Engineer");
        System.out.println("-----------------------------");
        System.out.println("Person Name : " + p.getName());
        System.out.println("Person Age  : " + p.getAge());
        System.out.println("-----------------------------");
        System.out.println("Employee Name   : " + e.getName());
        System.out.println("Employee Age    : " + e.getAge());
        System.out.println("Employee Title  : " + e.getTitle());
        System.out.println("Employee Salary : $" + e.getSalary());
    }
}