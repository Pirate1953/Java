package ru.mirea.IKBO1719.task9;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    /*
    *   Default abstract class constructor
    *
    *   Parameters: no
    *
    */
    public Shape() {}

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    public String toString() {
        return "Shape color = " + this.color + " Filled = " + this.filled;
    }
}
