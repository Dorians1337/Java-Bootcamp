package sef.module10.activity;

/**
 * Custom checked exception thrown when invalid inputs are passed to Calculator methods.
 *
 * @author Dorians Vaitovskis
 */
public class CustomCalculatorException extends Exception {

    /**
     * Constructs a new CustomCalculatorException with the specified detail message.
     *
     * @param message the detail error message
     */
    public CustomCalculatorException(String message) {
        super(message);
    }
}
