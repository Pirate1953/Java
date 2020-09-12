package ru.mirea.IKBO1719.task4;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        long[] array = new long[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.round(Math.random()); //Returns a double value then returns the closest long to the argument
            System.out.print(array[i] + " ");
        }

        System.out.println();

        Random rand = new Random(); //Creates a new random number generator
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(34); //Returns the next pseudorandom int
            System.out.print(array[i] + " ");
        }
    }
}
