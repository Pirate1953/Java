package ru.mirea.IKBO1719.task11;
import java.util.Random;

public class Operator implements EmployeePosition {
    protected String jobTitle;
    double Salary;

    /*
    *   Constructs Operator and initializes employee position name
    *
    *   Parameters: no
    */
    public Operator() {
        jobTitle = "Operator";
    }

    /*
     *   Returns operator's salary
     *
     *   Parameters: no
     *
     *   Return: double
     */
    public double getSalary() {
        return Salary;
    }

    @Override
    public int getProfit(){
        return 0;
    }

    @Override
    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public double calcSalary(double baseSalary) {
        Random rand = new Random(); //Creates a new random number generator
        Salary = baseSalary + ((115000 + rand.nextInt() % 140000) * 1.5); //nextInt - Returns the next pseudorandom, uniformly distributed int value from this random number generator's sequence
        return baseSalary;
    }
}
