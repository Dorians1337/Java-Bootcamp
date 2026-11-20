package sef.module10.activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Class demonstrating a List of Employee objects and finding the highest-paid employee.
 *
 * @author Dorians Vaitovskis
 */
public class EmployeeList {

    /**
     * Main method creating 5 Employee objects, adding them to a List,
     * and printing the highest-paid employee's name.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // 4.1 Create 5 employee objects using constructor of the Employee class
        Employee emp1 = new Employee("John Doe", "Junior QA", "Accenture", 35000.0);
        Employee emp2 = new Employee("Sarah Connor", "QA Automation Lead", "Accenture", 68000.0);
        Employee emp3 = new Employee("Mike Ross", "Software Developer", "Accenture", 55000.0);
        Employee emp4 = new Employee("Elena Gilbert", "Project Manager", "Accenture", 62000.0);
        Employee emp5 = new Employee("David Miller", "DevOps Engineer", "Accenture", 60000.0);

        // 4.2 Create list of Employees and add all 5 employee objects
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        // Register the list so both getHighestPaidEmp() and getHighestPaidEmp(empList) work
        Employee.setEmployeeList(empList);

        // 4.4 Print the highest-paid employee using getHighestPaidEmp() from Employee class
        System.out.println("The Employee whose salary is the highest is :" + Employee.getHighestPaidEmp());
    }
}
