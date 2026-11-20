package sef.module10.activity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * JUnit test suite for Calculator covering overloaded add, subtract, divide, and multiply methods.
 *
 * @author Dorians Vaitovskis
 */
public class CalculatorTest {

    private Calculator calculator;

    /**
     * Initializes a fresh Calculator instance before each test.
     */
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    /**
     * Cleans up the Calculator instance after each test.
     */
    @After
    public void tearDown() {
        calculator = null;
    }

    // --- 3.2.1: Min 4 test cases for add (testing both overloaded methods) ---

    @Test
    public void testAddTwoPositiveNumbers() {
        assertEquals(8, calculator.add(5, 3));
    }

    @Test
    public void testAddTwoNegativeNumbers() {
        assertEquals(-8, calculator.add(-5, -3));
    }

    @Test
    public void testAddThreePositiveNumbers() {
        assertEquals(15, calculator.add(4, 5, 6));
    }

    @Test
    public void testAddThreeMixedNumbers() {
        assertEquals(2, calculator.add(10, -5, -3));
    }

    // --- 3.2.1: Min 2 test cases for subtract ---

    @Test
    public void testSubtractPositiveNumbers() {
        assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    public void testSubtractResultingInNegative() {
        assertEquals(-5, calculator.subtract(5, 10));
    }

    // --- 3.2.2: Min 2 test cases for divide (including exception handling) ---

    @Test
    public void testDivideValidNumbers() {
        assertEquals(5, calculator.divide(20, 4));
    }

    @Test
    public void testDivideByZeroHandled() {
        // Verifies ArithmeticException is caught and returns 0 without crashing
        assertEquals(0, calculator.divide(10, 0));
    }

    // --- 3.2.2: Min 2 test cases for multiply (including custom exception handling) ---

    @Test
    public void testMultiplyValidNumbers() throws CustomCalculatorException {
        assertEquals(24, calculator.multiply(6, 4));
    }

    @Test(expected = CustomCalculatorException.class)
    public void testMultiplyNegativeFirstInputThrowsException() throws CustomCalculatorException {
        calculator.multiply(-3, 5);
    }

    @Test(expected = CustomCalculatorException.class)
    public void testMultiplyNegativeSecondInputThrowsException() throws CustomCalculatorException {
        calculator.multiply(3, -5);
    }
}
