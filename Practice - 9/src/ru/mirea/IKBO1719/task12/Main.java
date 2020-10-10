package ru.mirea.IKBO1719.task12;

/*
 *   A legacy programmatic interface for the Java Programming Language compiler
 */
public class Main {

    /*
     *   Main entry point for the launcher
     *
     *   @param args                 command line arguments
     *   @return                     void
     */
    public static void main(String[] args) {
        Company company = new Company();
        company.doSomething(new HandleEmployee() { //Anonymous
            @Override
            public void hEmployee(Employee employee) {
                System.out.println(employee.getBirthDate());
            }
        });
        company.doSomething(employee -> employee.setPhoneNumber(89123422999L));
        DoSomethings handle = new DoSomethings();
        company.doSomething(handle);
    }
}
