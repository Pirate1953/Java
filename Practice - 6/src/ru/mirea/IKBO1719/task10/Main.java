package ru.mirea.IKBO1719.task10;

public class Main {

    public static void main(String[] args) {
	    MovableCircle circle = new MovableCircle(0, 0, 0, 3, 20);
	    circle.moveDown();
        System.out.println(circle.toString());

        MovableRectangle rec = new MovableRectangle(1, 1, 5, 5, 3, 0);
        rec.moveLeft();
        System.out.println(rec.toString());
    }
}
