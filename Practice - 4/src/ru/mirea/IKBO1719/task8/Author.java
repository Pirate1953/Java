package ru.mirea.IKBO1719.task8;

public class Author {
    private final String name;
    private String email;
    public char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return this.gender;
    }

    public String toString() {
        return "Name " + this.name + " Email " + this.email + " Gender " + this.gender;
    }
}
