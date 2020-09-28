package ru.mirea.IKBO1719.task9;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "Red", true);
        circle.setRadius(3.0);
        System.out.println(circle.toString());
        System.out.println("Circle radius = " + circle.getRadius());

        Rectangle rec = new Rectangle(3.0, 4.0, "Red", false);
        rec.setLength(4.5);
        rec.setWidth(5.77);
        rec.setColor("Blue");
        rec.setFilled(true);
        System.out.println(rec.toString());
        System.out.println("Rectangle Perimeter = " + rec.getPerimeter());

        Square rec2 = new Square(25.0, "Green", true);
        rec2.setSide(5.0);
        rec2.setColor("Blue");
        rec2.setFilled(false);
        System.out.println(rec2.toString());
        System.out.println("Square Perimeter = " + rec2.getPerimeter());
        System.out.println("Square Color = " + rec2.getColor());
    }
}
