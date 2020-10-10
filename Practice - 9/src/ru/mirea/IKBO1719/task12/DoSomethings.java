package ru.mirea.IKBO1719.task12;

public class DoSomethings implements HandleEmployee {

    /*
     *   Sets name to employee
     *
     *   @param employee             employee object to set name for
     *   @return                     void
     */
    @Override
    public void hEmployee(Employee employee) {
        employee.setName("Sergey");
    }
}
