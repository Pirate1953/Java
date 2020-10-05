package ru.mirea.IKBO1719.task11;

import java.util.Random;

public class TopManager implements EmployeePosition {
    String jobTitle;
    Company company;
    double Salary;
    int Profit;

    /*
     *   Constructs Top Manager and calculates his profit
     *
     *   Parameters: comp - Object, describing the company and staff (Company class object)
     */
    public TopManager(Company comp) {
        this.jobTitle = "Top manager";
        company = comp;
        Random rand = new Random();
        Profit = 115000 + rand.nextInt() % 140000;
    }

    /*
     *   Returns top manager's profit
     *
     *   Parameters: no
     *
     *   Return: int
     */
    public int getProfit(){
        return Profit;
    }

    /*
     *   Returns top manager's salary
     *
     *   Parameters: no
     *
     *   Return: double
     */
    public double getSalary() {
        return Salary;
    }

    @Override
    public double calcSalary(double baseSalary){
        if(company.getInCome() > 10000000) {
            Salary = baseSalary + (Profit * 1.5);
            return Salary;
        }
        else {
            return baseSalary;
        }
    }

    @Override
    public String getJobTitle() {
        return jobTitle;
    }
}
