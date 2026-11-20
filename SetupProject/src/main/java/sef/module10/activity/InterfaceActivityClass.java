package sef.module10.activity;

/**
 * Runner class demonstrating Vehicle interface implementations with Bike and Car.
 *
 * @author Dorians Vaitovskis
 */
public class InterfaceActivityClass {

    /**
     * Main entry point creating Bike and Car objects via the Vehicle interface
     * and invoking their start() and stop() methods.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // 6.4.2 Create Bike object using Vehicle interface and call methods
        Vehicle bike = new Bike();
        bike.start();
        bike.stop();

        System.out.println("-----------------------------");

        // 6.4.3 Create Car object using Vehicle interface and call methods
        Vehicle car = new Car();
        car.start();
        car.stop();
    }
}
