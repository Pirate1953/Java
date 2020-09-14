package ru.mirea.IKBO1719.task7;

public class Circle {
    private int Radius;
    private int Diameter;

    /*
    *   Constructs Circle object
    *
    *   Parameters:
    *   rad - radius
    *   diam - diameter
    */
    public Circle(int rad, int diam) {
        Radius = rad;
        Diameter = diam;
    }

    /*
    *   Returns radius value
    *
    *   Parameters: no
    *
    *   Return: radius
    */
    public int getRadius() {
        return Radius;
    }

    /*
     *   Returns diameter value
     *
     *   Parameters: no
     *
     *   Return: diameter
     */
    public int getDiameter() {
        return Diameter;
    }

    /*
     *   Sets radius for circle
     *
     *   Parameters:
     *   rad - radius
     *
     *   Return: void
     */
    public void setRadius(int rad) {
        Radius = rad;
    }

    /*
     *   Sets diameter for circle
     *
     *   Parameters:
     *   diam - diameter
     *
     *   Return: void
     */
    public void setDiameter(int diam) {
        Diameter = diam;
    }
}
