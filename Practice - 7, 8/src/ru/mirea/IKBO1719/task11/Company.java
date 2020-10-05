package ru.mirea.IKBO1719.task11;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private double Income;
    ArrayList<Employee> employeePositions;

    /*
     *   Constructs an empty list of employees
     *
     *   Parameters: no
     */
    public Company() {
        employeePositions = new ArrayList<>();
    }

    /*
    *   Adds new employee to the list
    *
    *   Parameters: employee - Object, describing employee (Employee class object)
    *
    *   Return: void
    */
    public void hire(Employee employee) {
        employeePositions.add(employee); //Appends Employee class object to the end of this list.
        Income += employee.getPos().getProfit();
    }

    /*
     *   Adds new employee list
     *
     *   Parameters: employees - list of employees (ArrayList class object)
     *
     *   Return: void
     */
    public void hireAll(ArrayList<Employee> employees) {
        employeePositions.addAll(employees);
        for (Employee emp:employees
        ) {
            Income += emp.getPos().getProfit();
        }
    }

    /*
    *   Returns sorted ascending list of employees
    *
    *   Parameters: count - list length
    *
    *   Return: List interface object
    */
    List<Employee> getTopSalaryStaff(int count) {
        ArrayList<Employee> employeesCopy;
        if (count > employeePositions.size()) {
            return null;
        } else {
            employeesCopy = new ArrayList<>(employeePositions); //Constructs a list containing the elements of the "employeePositions" collection, in the order they are returned by the collection's iterator.
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count - 1; j++) {
                    if (employeesCopy.get(j).getPos().getSalary() < employeesCopy.get(j + 1).getPos().getSalary()) {
                        Employee employee_obj = employeesCopy.get(j);
                        employeesCopy.set(j, employeesCopy.get(j + 1)); //Replaces the element at "j" position in this list with the specified element from employeesCopy list
                        employeesCopy.set(j + 1, employee_obj);
                    }
                }
            }
        }
        return employeesCopy.subList(0, count); //Returns a view of the portion of this list between 0, inclusive, and "count", exclusive
    }

    /*
     *   Returns sorted descending list of employees
     *
     *   Parameters: count - list length
     *
     *   Return: List interface object
     */
    List<Employee> getLowestSalaryStaff(int count){
        ArrayList<Employee> employeesCopy;
        if (count > employeePositions.size()) {
            return null;
        } else {
            employeesCopy = new ArrayList<>(employeePositions);
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count - 1; j++) {
                    if (employeesCopy.get(j).getPos().getSalary() > employeesCopy.get(j + 1).getPos().getSalary()) {
                        Employee employee_obj = employeesCopy.get(j);
                        employeesCopy.set(j, employeesCopy.get(j + 1));
                        employeesCopy.set(j + 1, employee_obj);
                    }
                }
            }
        }
        return employeesCopy.subList(0, count);
    }

    /*
    *   Returns company income
    *
    *   Parameters: no
    *
    *   Return: double
    */
    public double getInCome(){
        return Income;
    }

    /*
     *   Removes employee from list
     *
     *   Parameters: employee - employee (Employee class object)
     *
     *   Return: void
     */
    public void fire(Employee employee){
        employeePositions.remove(employee); //Removes the first occurrence of the specified element from this list
    }

    /*
     *   Removes employee from list by index
     *
     *   Parameters: employee - employee (Employee class object)
     *
     *   Return: void
     */
    public void fire(int index){
        employeePositions.remove(index);
    }

    /*
     *   Prints all employees from list
     *
     *   Parameters: no
     *
     *   Return: void
     */
    public void printAll(){
        for (Employee e:employeePositions) {
            System.out.println(e.Name + " " + e.SecondName + " Position: "+ e.getPos().getJobTitle() + " Base salary = " +  e.getBaseSalary() + " Salary = " + e.getPos().getSalary());
        }
    }

    /*
     *   Returns employee list length
     *
     *   Parameters: no
     *
     *   Return: int
     */
    public int getEmployersCount(){
        return employeePositions.size();
    }
}
