package ru.mirea.IKBO1719.task6;

public class Shape {
    private String Name;

    /*
    *   Constructor initializes class properties
    *
    *   Parameters: no
    */
    public Shape(String name) {
        Name = name;
    }

    /*
     *   Gets object name
     *
     *   Parameters: no
     *
     *   Return: object name (string)
     */
    public String getName() {
        return Name;
    }

    /*
     *   Sets object name
     *
     *   Parameters: name - object name
     *
     *   Return: no
     */
    public void setName(String name) {
        Name = name;
    }

    /*
    *   Creates and returns string representation of class
    *
    *   Parameters: no
    *
    *   Return: string representation
    */
    public String toString() {
        return "Shape name = " + Name;
    }
}
