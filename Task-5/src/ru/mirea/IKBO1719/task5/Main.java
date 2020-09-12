package ru.mirea.IKBO1719.task5;

public class Main {

    public static void main(String[] args) {
        System.out.println(Factorial(4));
    }

    /*
    *   Returns factorial of argument
    *
    *   Parameters:
    *   a - value to calculate
    *
    *   Return: factorial (int)
    */
    public static int Factorial(int a)
    {
        int i = 1, res = 1;
        while (i <= a) {
            res *= i;
            i++;
        }
        return res;
    }
}
