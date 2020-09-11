package ru.mirea.IKBO1719.task1;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,22};
        int Sum = 0, i = 0;

        //for loop
        for (; i <= array.length - 1; i++) {
            Sum += array[i];
        }
        System.out.println(Sum); //Prints an integer and then terminate the line.

        //while loop
        i = 0; Sum = 0;
        while (i <= array.length - 1) {
            Sum += array[i];
            i++;
        }
        System.out.println(Sum);

        //do while loop
        i = 0; Sum = 0;
        do {
            Sum += array[i];
            i++;
        } while (i <= array.length - 1);
        System.out.println(Sum);
    }
}