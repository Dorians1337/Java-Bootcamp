package sef.module10.activity;

/**
 * Abstract class representing a Person with basic attributes and behaviors.
 *
 * @author Dorians Vaitovskis
 */
public abstract class Person {

    // Private attributes for encapsulation
    private String name;
    private int age;

    /**
     * Default constructor for Person.
     */
    public Person() {
    }

    /**
     * Parameterized constructor to initialize a Person with a name and age.
     *
     * @param name the name of the person
     * @param age  the age of the person
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Gets the name of the person.
     *
     * @return the person's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the age of the person.
     *
     * @return the person's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     *
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Abstract method for introducing the person.
     * Subclasses must provide their own specific introduction implementation.
     */
    public abstract void introduce();
}
