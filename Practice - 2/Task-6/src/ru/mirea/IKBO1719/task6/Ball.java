package ru.mirea.IKBO1719.task6;

public class Ball {
    private String Name;

    public Ball(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String toString() {
        return "Ball name = " + Name;
    }
}
