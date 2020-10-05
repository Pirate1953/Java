package ru.mirea.IKBO1719.task11;

public interface EmployeePosition {

    /*
    *   Returns job title
    *
    *   Parameters: no
    *
    *   Return: String
    */
    String getJobTitle();

    /*
     *   Returns calculated employee salary according to the fixed salary
     *
     *   Parameters: baseSalary - Fixed salary (double)
     *
     *   Return: double
     */
    double calcSalary(double baseSalary);

    /*
     *   Returns salary
     *
     *   Parameters: no
     *
     *   Return: double
     */
    double getSalary();

    /*
     *   Returns profit
     *
     *   Parameters: no
     *
     *   Return: int
     */
    int getProfit();
}
