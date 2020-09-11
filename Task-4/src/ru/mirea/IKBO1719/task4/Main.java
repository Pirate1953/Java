package ru.mirea.IKBO1719.task4;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        long[] array = new long[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.round(Math.random());
            System.out.print(array[i] + " ");
        }

        System.out.println();

        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(34);
            System.out.print(array[i] + " ");
        }
    }
}
