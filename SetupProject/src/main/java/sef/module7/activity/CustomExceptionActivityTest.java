package sef.module7.activity;

public class CustomExceptionActivityTest {

    public static void main(String[] args) {
        CustomExceptionActivityTest obj = new CustomExceptionActivityTest();
        try {
            obj.validateUser("John");
            obj.validateUser("Dorians");
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }
    }
    void validateUser(String name) throws CustomExceptionActivity {
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
        int flag = 0;
        for (int i = 0; i < 4; i++) {
            if (validUsers[i].equals(name)) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            throw new CustomExceptionActivity();
        } else if (flag == 1) {
            System.out.println("Welcome to Payroll program");
        }
    }
}
