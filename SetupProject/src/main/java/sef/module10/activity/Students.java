package sef.module10.activity;

/**
 * Students class extending the abstract Person class.
 *
 * @author Dorians Vaitovskis
 */
public class Students extends Person {

    // Private attribute specific to Students
    private String schoolName;

    /**
     * Default constructor for Students.
     */
    public Students() {
        super();
    }

    /**
     * Parameterized constructor initializing schoolName.
     *
     * @param schoolName the name of the school or university
     */
    public Students(String schoolName) {
        super();
        this.schoolName = schoolName;
    }

    /**
     * Full parameterized constructor initializing Person fields and schoolName.
     *
     * @param name       the student's name
     * @param age        the student's age
     * @param schoolName the name of the school or university
     */
    public Students(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    /**
     * Gets the school name.
     *
     * @return the school name
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * Sets the school name.
     *
     * @param schoolName the school name to set
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * Overrides the abstract introduce method from Person to display Student details.
     */
    @Override
    public void introduce() {
        System.out.println("I am study in university " + schoolName);
    }
}
