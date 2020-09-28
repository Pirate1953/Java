package ru.mirea.IKBO1719.task9;

public class Square extends Rectangle {

    public Square(double side, String color, boolean filled) {
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    public String toString() {
        return "Square Side = " + this.width + " Color = " + this.color + " Filled = " + this.filled;
    }
}
