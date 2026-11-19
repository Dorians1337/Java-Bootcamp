package sef.module7.activity;

public class ArithmeticExceptionActivity {
    public static void main(String[] args) {
        ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();
        obj.catchMe(10, 0);

        System.out.println("-----------------------------");

        obj.catchMe(10, 2);
    }

    void catchMe(int num1, int num2) {
        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero!");
        } finally {
            System.out.println("Thank you for using this program.");
        }
    }
}
