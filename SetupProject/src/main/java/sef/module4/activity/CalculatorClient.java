package sef.module4.activity;
public class CalculatorClient {
    public static void main(String[] args) {
        Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);
        System.out.println("*** Calculations will be performed using " + normalCalc.getCalculatorType() + " calculator ***");
        int result = normalCalc.add(4, 5);
        System.out.println("1) Add result is " + result);
        int[] mul = {2, 3, 4};
        int mulResult = normalCalc.multiply(mul);
        System.out.println("2) Multiply result is " + mulResult);
        int divResult = normalCalc.divide(10, 2);
        System.out.println("3) Divide result is " + divResult);
        int subResult = normalCalc.subtract(10, 2);
        System.out.println("4) Subtract result is " + subResult);
    }
}