package ru.mirea.IKBO1719.task11;

import java.util.Random;

public class Manager implements EmployeePosition {
    protected String jobTitle;
    double Salary;
    int Profit;

    /*
     *   Constructs Manager and calculates his profit
     *
     *   Parameters: no
     */
    public Manager() {
        this.jobTitle= "Manager";
        Random rand = new Random();
        Profit = 115000 + rand.nextInt() % 140000;
    }

    /*
     *   Returns manager's profit
     *
     *   Parameters: no
     *
     *   Return: int
     */
    public int getProfit() {
        return Profit;
    }

    /*
     *   Returns manager's salary
     *
     *   Parameters: no
     *
     *   Return: double
     */
    public double getSalary() {
        return Salary;
    }

    @Override
    public double calcSalary(double baseSalary) {
        Salary = baseSalary + (Profit * 1.5);
        return Salary;
    }

    @Override
    public String getJobTitle() {
        return jobTitle;
    }
}
