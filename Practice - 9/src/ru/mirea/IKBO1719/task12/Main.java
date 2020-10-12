package ru.mirea.IKBO1719.task12;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.doSomething(new HandleEmployee() { //Anonymous
            @Override
            public void hEmployee(Employee employee) {
                System.out.println(employee.getBirthDate());
            }
        });
        company.doSomething(employee -> employee.setSecondName("Yakovlev"));
        DoSomethings handle = new DoSomethings();
        company.doSomething(handle);
    }
}
