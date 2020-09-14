package ru.mirea.IKBO1719.task7;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2, 4);
        circle.setRadius(5);
        circle.setDiameter(10);
        System.out.println("Radius = " + circle.getRadius() + " Diameter = " + circle.getDiameter());
    }
}
