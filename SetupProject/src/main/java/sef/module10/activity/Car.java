package sef.module10.activity;

/**
 * Car class implementing the Vehicle interface.
 *
 * @author Dorians Vaitovskis
 */
public class Car implements Vehicle {

    /**
     * Custom implementation of start() for a Car.
     */
    @Override
    public void start() {
        System.out.println("Car engine is starting...");
    }

    /**
     * Custom implementation of stop() for a Car.
     */
    @Override
    public void stop() {
        System.out.println("Car has stopped.");
    }
}
