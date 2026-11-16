package sef.module2.activity;
public class AddWholeNum {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 50; i <= 100; i++) {
            total = total + i;
        }
        System.out.println("The sum of whole numbers from 50 to 100 is: " + total);
    }
}