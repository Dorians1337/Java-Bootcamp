package sef.module10.activity;

import java.util.List;

/**
 * Employee class extending the abstract Person class.
 *
 * @author Dorians Vaitovskis
 */
public class Employee extends Person {

    // Shared list used by the no-argument getHighestPaidEmp()
    private static List<Employee> employeeList;

    // Private attributes specific to Employee
    private String jobTitle;
    private String company;
    private double salary;

    /**
     * Default constructor for Employee.
     */
    public Employee() {
        super();
    }

    /**
     * Parameterized constructor initializing Employee-specific fields.
     *
     * @param jobTitle the employee's job title
     * @param company  the company name
     * @param salary   the employee's salary
     */
    public Employee(String jobTitle, String company, double salary) {
        super();
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    /**
     * Parameterized constructor initializing name along with jobTitle, company, and salary.
     *
     * @param name     the employee's name
     * @param jobTitle the employee's job title
     * @param company  the company name
     * @param salary   the employee's salary
     */
    public Employee(String name, String jobTitle, String company, double salary) {
        super();
        setName(name);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    /**
     * Full parameterized constructor initializing both Person and Employee fields.
     *
     * @param name     the employee's name
     * @param age      the employee's age
     * @param jobTitle the employee's job title
     * @param company  the company name
     * @param salary   the employee's salary
     */
    public Employee(String name, int age, String jobTitle, String company, double salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    /**
     * Gets the job title.
     *
     * @return the job title
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the job title.
     *
     * @param jobTitle the job title to set
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Gets the company name.
     *
     * @return the company name
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the company name.
     *
     * @param company the company name to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Gets the salary.
     *
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the salary.
     *
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Sets the shared employee list for no-argument lookup.
     *
     * @param empList list of Employee objects
     */
    public static void setEmployeeList(List<Employee> empList) {
        employeeList = empList;
    }

    /**
     * Overrides the abstract introduce method from Person to display Employee details.
     */
    @Override
    public void introduce() {
        System.out.println("My name is " + getName() + " and i am " + getAge() + " years old");
        System.out.println("I am work as " + jobTitle + " in " + company + " and my salary is " + salary);
    }

    /**
     * No-argument overload matching the slide signature getHighestPaidEmp().
     *
     * @return the name of the highest-paid employee
     */
    public static String getHighestPaidEmp() {
        return getHighestPaidEmp(employeeList);
    }

    /**
     * Finds and returns the name of the employee with the highest salary from the given list.
     *
     * @param empList list of Employee objects
     * @return the name of the highest-paid employee
     */
    public static String getHighestPaidEmp(List<Employee> empList) {
        if (empList == null || empList.isEmpty()) {
            return "No employees in list";
        }

        Employee highestPaid = empList.get(0);
        for (Employee emp : empList) {
            if (emp.getSalary() > highestPaid.getSalary()) {
                highestPaid = emp;
            }
        }
        return highestPaid.getName();
    }
}
