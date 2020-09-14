package ru.mirea.IKBO1719.task7;

import java.util.Calendar;

public class Book {
    private String Author;
    private String Name;
    private final Calendar Date;
    private int PagesCount;

    public Book(String author, String name, int year, int month, int day, int pagesCount) {
        Author = author;
        Name = name;
        Date = Calendar.getInstance(); //Gets a calendar using the default time zone and locale
        Date.set(year, month, day);
        PagesCount = pagesCount;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDate(int year, int month, int day) {
        Date.set(year, month, day);
    }

    public void setPagesCount(int pagesCount) {
        PagesCount = pagesCount;
    }

    public String getAuthor() {
        return Author;
    }

    public String getName() {
        return Name;
    }

    public String getDate() {
        return "Year " + Date.get(Calendar.YEAR) + " Month " + Date.get(Calendar.MONTH) + " Day " + Date.get(Calendar.DAY_OF_MONTH);
    }

    public int getPagesCount() {
        return PagesCount;
    }
}
