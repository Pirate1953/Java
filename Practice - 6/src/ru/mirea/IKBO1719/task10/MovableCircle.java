package ru.mirea.IKBO1719.task10;

public class MovableCircle implements Movable {
    private final int radius;
    private final MovablePoint point;

    public MovableCircle(int x, int y, int xVel, int yVel, int radius) {
        this.radius = radius;
        this.point = new MovablePoint(x, y, xVel, yVel); //Constructs MovablePoint class object
    }

    @Override
    public void moveUp() {
        point.moveUp();
    }

    @Override
    public void moveDown() {
        point.moveDown();
    }

    @Override
    public void moveLeft() {
        point.moveLeft();
    }

    @Override
    public void moveRight() {
        point.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle: " + "radius = " + radius + " point = " + point;
    }
}
