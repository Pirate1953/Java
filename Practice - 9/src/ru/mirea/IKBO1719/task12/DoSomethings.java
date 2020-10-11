package ru.mirea.IKBO1719.task12;

/**
 *   Overrides employee handling method, implements HandleEmployee interface
 */
public class DoSomethings implements HandleEmployee {

    /**
     *   Sets name to employee
     *
     *   @param employee             employee object to set name for
     */
    @Override
    public void hEmployee(Employee employee) {
        employee.setName("Sergey");
    }
}
