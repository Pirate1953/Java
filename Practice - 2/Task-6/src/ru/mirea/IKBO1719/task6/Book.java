package ru.mirea.IKBO1719.task6;

public class Book {
    private String Name;

    public Book(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String toString() {
        return "Book name = " + Name;
    }
}
