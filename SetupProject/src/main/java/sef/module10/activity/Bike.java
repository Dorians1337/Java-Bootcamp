package sef.module10.activity;

/**
 * Bike class implementing the Vehicle interface.
 *
 * @author Dorians Vaitovskis
 */
public class Bike implements Vehicle {

    /**
     * Custom implementation of start() for a Bike.
     */
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }

    /**
     * Custom implementation of stop() for a Bike.
     */
    @Override
    public void stop() {
        System.out.println("Bike has stopped.");
    }
}
