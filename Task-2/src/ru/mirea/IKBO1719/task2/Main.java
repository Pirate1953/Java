package ru.mirea.IKBO1719.task2;

public class Main {

    /*
    *   Main entry point for the launcher.
    *
    *   Parameters:
    *   args - command line arguments
    *
    *   Return void
    */
    public static void main(String[] args) {
	    for(int i = 0; i <= args.length - 1; i++)
        {
            System.out.println(args[i]); //Prints command line arguments and then terminate the line.
        }
    }
}
