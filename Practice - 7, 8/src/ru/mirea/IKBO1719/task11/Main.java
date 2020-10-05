package ru.mirea.IKBO1719.task11;

public class Main {

    public static void main(String[] args) {
        Company company = new Company();
        for (int i = 0; i < 180; i++) {
            Employee operator = new Employee(String.valueOf(i), "Alex", 34000, new Operator()); //valueOf - Returns the string representation of the char array argument
            company.hire(operator);
        }

        for (int i = 0; i < 80; i++) {
            Employee operator = new Employee(String.valueOf(i), "Bob", 80000, new Manager());
            company.hire(operator);
        }

        for (int i = 0; i < 10; i++) {
            Employee operator = new Employee(String.valueOf(i), "Steve", 90000, new TopManager(company));
            company.hire(operator);
        }

        company.printAll();
        int i = 1;
        System.out.println("15 высоких зарплат:");
        for (Employee e : company.getTopSalaryStaff(15)) {
            System.out.println(i + " - " + e.getPos().getSalary());
            i++;
        }

        i = 1;
        System.out.println("30 низких зарплат:");
        for (Employee e : company.getLowestSalaryStaff(30)) {
            System.out.println(i + " - " + e.getPos().getSalary());
            i++;
        }

        for (int j = 0; j < company.getEmployersCount() / 2; j++) {
            company.fire(j);
        }

        i = 1;
        System.out.println("10 высоких зарплат:");
        for(Employee e : company.getTopSalaryStaff(10)){
            System.out.println(i + " - " + e.getPos().getSalary());
            i++;
        }
        i = 1;
        System.out.println("30 низких зарплат:");
        for(Employee e : company.getLowestSalaryStaff(30)){
            System.out.println(i + " - " + e.getPos().getSalary());
            i++;
        }
    }
}
