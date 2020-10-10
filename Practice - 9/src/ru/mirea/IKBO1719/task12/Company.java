package ru.mirea.IKBO1719.task12;

import java.util.ArrayList;

public class Company {
    ArrayList<Employee> employees = new ArrayList<>(); //Constructs an empty list of Employee class objects

    /*
     *   Adds new employee to the list
     *
     *   @param employee             employee object to add to the list
     *   @return                     void
     */
    public void Hire(Employee employee) {
        employees.add(employee);
    }

    /*
     *   Removes employee from the list by index
     *
     *   @param index                employee index to remove
     *   @return                     void
     */
    public void Fire(int index) {
        employees.remove(index);
    }

    /*
     *   Makes something to employee
     *
     *   @param handle               HandleEmployee interface object to handle
     *   @return                     void
     */
    public void doSomething(HandleEmployee handle) {
        for (int i = 0; i < employees.size(); i++) {
            handle.hEmployee(employees.get(i));
        }
    }
}
