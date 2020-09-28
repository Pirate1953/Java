package ru.mirea.IKBO1719.task9;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {}

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return 0.0;
    }

    @Override
    public double getPerimeter() {
        return length * 2 + width * 2;
    }

    public String toString() {
        return "Rectangle Width = " + this.width + " Length = " + this.length + " Color = " + this.color + " Filled = " + this.filled;
    }

}
