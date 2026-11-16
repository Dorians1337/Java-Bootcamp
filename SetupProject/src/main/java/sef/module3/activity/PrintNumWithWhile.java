package sef.module3.activity;
public class PrintNumWithWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {
            System.out.println(i);
            i += 2; // Jumps to the next odd number (1, 3, 5, 7...)
        }
    }
}