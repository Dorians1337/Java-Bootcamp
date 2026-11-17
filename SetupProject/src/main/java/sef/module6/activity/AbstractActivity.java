package sef.module6.activity;

public class AbstractActivity {
    public static void main(String args[]) {

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Blue");
        System.out.println("Rectangle Color: " + rectangle.getColor());

        System.out.println("Rectangle Area: " + rectangle.calculateArea(2, 4, 0));
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter(2, 4, 0));

        System.out.println("-----------------------------");

        Circle circle = new Circle();
        circle.setColor("Pink");
        System.out.println("Circle Color: " + circle.getColor());

        System.out.println("Circle Area: " + circle.calculateArea(0, 0, 5));
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter(0, 0, 5));
    }
}
