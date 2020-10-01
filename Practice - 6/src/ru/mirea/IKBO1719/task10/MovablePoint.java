package ru.mirea.IKBO1719.task10;

/*
*   Describes point with coordinates and velocity (implements Movable interface)
*/
public class MovablePoint implements Movable {
    private int x;
    private int y;
    private final int xVel;
    private final int yVel;

    public MovablePoint(int x, int y, int xVel, int yVel) {
        this.x = x;
        this.y = y;
        this.xVel = xVel;
        this.yVel = yVel;
    }

    /*
    *   Annotation type
    */
    @Override //Indicates that a method declaration is intended to override a method declaration in a supertype.
    public void moveUp() {
        this.y += this.yVel;
    }

    @Override
    public void moveDown() {
        this.y -= this.yVel;
    }

    @Override
    public void moveLeft() {
        this.x -= this.xVel;
    }

    @Override
    public void moveRight() {
        this.x += this.xVel;
    }

    @Override
    public String toString() {
        return "MovablePoint: " + "x = " + this.x + ", y = " + this.y + ", xVel = " + this.xVel + ", yVel = " + this.yVel;
    }
}
