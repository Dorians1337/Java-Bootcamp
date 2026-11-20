package sef.module10.activity;

/**
 * Runner class to test Employee and Students implementations of Person.
 *
 * @author Dorians Vaitovskis
 */
public class AbstractActivity {

    /**
     * Main entry point executing introduce() on Employee and Students objects.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // 2.3.1 Create Employee object and call introduce()
        Employee employee = new Employee("John Doe", 30, "QA Automation Engineer", "Accenture", 50000.0);
        employee.introduce();

        System.out.println("-----------------------------");

        // 2.3.2 Create Students object and call introduce()
        Students student = new Students("Dorians Vaitovskis", 22, "Riga Technical University");
        student.introduce();
    }
}
