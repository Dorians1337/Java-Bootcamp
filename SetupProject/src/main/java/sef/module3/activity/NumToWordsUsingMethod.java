package sef.module3.activity;
public class NumToWordsUsingMethod {
    public static void main(String[] args) {
        printWord(8);
        printWord(9);
        printWord(10);
    }
    public static void printWord(int i) {
        String numText = "";
        switch (i) {
            case 1:
                numText = "ONE";
                break;
            case 2:
                numText = "TWO";
                break;
            case 3:
                numText = "THREE";
                break;
            case 4:
                numText = "FOUR";
                break;
            case 5:
                numText = "FIVE";
                break;
            case 6:
                numText = "SIX";
                break;
            case 7:
                numText = "SEVEN";
                break;
            case 8:
                numText = "EIGHT";
                break;
            case 9:
                numText = "NINE";
                break;
            case 10:
                numText = "TEN";
                break;
            default:
                numText = "NUMBER " + i;
        }
        System.out.println(numText);
    }
}
