package sef.module9.activity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() throws Exception {
        person = new Person();
    }

    @After
    public void tearDown() throws Exception {
        person = null;
    }

    @Test
    public void testGettersAndSetters() {
        person.setWeight(75);
        assertEquals(75, person.getWeight());

        person.setHeight(1.80f);
        assertEquals(1.80f, person.getHeight(), 0.001f);
    }

    @Test
    public void testGetBodyMassIndex() {
        assertEquals("Underweight", person.getBodyMassIndex(50, 1.80));
        assertEquals("Normal weight", person.getBodyMassIndex(70, 1.75));
        assertEquals("Overweight", person.getBodyMassIndex(85, 1.75));
        assertEquals("Obese", person.getBodyMassIndex(105, 1.75));

        assertEquals("Invalid input", person.getBodyMassIndex(0, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(-10, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(601, 1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(70, 0));
        assertEquals("Invalid input", person.getBodyMassIndex(70, -1.75));
        assertEquals("Invalid input", person.getBodyMassIndex(70, 3.1));
    }
}
