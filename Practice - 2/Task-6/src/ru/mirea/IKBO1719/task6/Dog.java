package ru.mirea.IKBO1719.task6;

public class Dog {
    private String Name;
    private int Age;

    public Dog(String name, int age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    /*
    *   Returns human age
    *
    *   Parameters: no
    *
    *   Return: age (int)
    */
    public int getHumanAges() {
        return Age * 7;
    }

    public String toString() {
        return "Dog name = " + Name + " Dog age = " + Age;
    }
}
