package ru.mirea.IKBO1719.task6;

import java.util.ArrayList;

public class DogKennel {
    ArrayList<Dog> Dogs;

    /*
    *   Constructor initializes class properties, creates list of Dog class objects
    *
    *   Parameters:
    *   capacity - list size
    *
    */
    public DogKennel(int capacity) {
        Dogs = new ArrayList<>(0); //Constructs an empty list with the specified initial capacity
        Dog DogObject;
        for (int i = 0; i <= capacity - 1; i++) {
            DogObject = new Dog("Dog № " + i, 2); //age = 2 is default value
            Dogs.add(i, DogObject); //Inserts the Dog class object at the specified position in this list.
        }
    }

    /*
    *   Adds new Dog class object to the list
    *
    *   Parameters:
    *   name - dog name
    *   age - dog age
    *
    *   Return void
    */
    public void addDog(String name, int age) {
        Dog NewDog = new Dog(name, age);
        Dogs.add(NewDog);
    }

    public void testShowCreatedDogs() {
        for (int i = 0; i <= Dogs.size() - 1; i++) {
            System.out.println("Dog name = " + Dogs.get(i).getName() + " age = " +  Dogs.get(i).getAge());
        }
    }
}
