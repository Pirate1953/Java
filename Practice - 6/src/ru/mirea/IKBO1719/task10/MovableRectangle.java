package ru.mirea.IKBO1719.task10;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xVel, int yVel) {
        this.topLeft = new MovablePoint(x1, y1, xVel, yVel);
        this.bottomRight = new MovablePoint(x2, y2, xVel, yVel);
    }

    @Override
    public void moveUp() {
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
    }

    /*
    *   Returns string representation of MovablePoint class objects
    *
    *   Parameters: no
    *
    *   Return: String
    */
    @Override
    public String toString() {
        return "MovableRectangle: " + "topLeft = " + this.topLeft + " bottomRight = " + this.bottomRight;
    }
}
