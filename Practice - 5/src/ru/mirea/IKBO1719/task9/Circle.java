package ru.mirea.IKBO1719.task9;

public class Circle extends Shape {
    protected double radius;

    public Circle(double radius, String color, boolean filled) {

        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 0.0;
    }

    @Override
    public double getPerimeter() {
        return 0.0;
    }

    public String toString() {
        return "Circle radius = " + this.radius + " color = " + this.color + " filled = " + this.filled;
    }
}
