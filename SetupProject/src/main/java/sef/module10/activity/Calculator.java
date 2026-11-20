package sef.module10.activity;

/**
 * Calculator class demonstrating method overloading, standard exception handling,
 * and custom exception handling.
 *
 * @author Dorians Vaitovskis
 */
public class Calculator {

    /**
     * Adds two integers (overloaded method 1).
     *
     * @param a first integer
     * @param b second integer
     * @return sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Adds three integers (overloaded method 2).
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return sum of a, b, and c
     */
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Subtracts the second integer from the first integer.
     *
     * @param a first integer
     * @param b second integer
     * @return difference (a - b)
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Divides two integers and handles division by zero using Java's ArithmeticException.
     *
     * @param a dividend
     * @param b divisor
     * @return quotient (a / b), or 0 if b is zero
     */
    public int divide(int a, int b) {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Invalid input: Cannot divide by zero.");
        }
        return result;
    }

    /**
     * Multiplies two non-negative integers. Throws CustomCalculatorException for negative inputs.
     *
     * @param a first integer (must be >= 0)
     * @param b second integer (must be >= 0)
     * @return product (a * b)
     * @throws CustomCalculatorException if either input is negative
     */
    public int multiply(int a, int b) throws CustomCalculatorException {
        try {
            if (a < 0 || b < 0) {
                throw new CustomCalculatorException("Invalid input: Negative numbers are not allowed.");
            }
            return a * b;
        } catch (CustomCalculatorException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
