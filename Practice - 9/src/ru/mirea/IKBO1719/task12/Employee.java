package ru.mirea.IKBO1719.task12;

import java.time.LocalDate;

/**
*   Describes and controls employee
*/
public class Employee {
    private String Name;
    private String secondName;
    private final LocalDate birthDate;
    private final String regPlace;
    private long phoneNumber;
    private double Salary;

    /**
    *   Constructs employee, sets his name, second name, date of birth, registration place, phone number and salary
    *
    *   @param Name                 name to set
    *   @param secondName           second name to set
    *   @param birthDate            date of birth to set
    *   @param regPlace             registration place to set
    *   @param phoneNumber          phone number to set
    *   @param Salary               employee salary to set
    */
    public Employee(String Name, String secondName, LocalDate birthDate, String regPlace, int phoneNumber, double Salary) {
        this.Name = Name;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.regPlace = regPlace;
        this.phoneNumber = phoneNumber;
        this.Salary = Salary;

    }

    /**
     *   Sets name to employee
     *
     *   @param Name                 name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     *   Sets second name to employee
     *
     *   @param secondName           second name to set
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     *   Sets phone number to employee
     *
     *   @param phoneNumber          phone number to set
     */
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     *   Sets employee salary
     *
     *   @param Salary               salary to set
     */
    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    /**
     *   Returns employee name
     *
     *   @return                     employee name
     */
    public String getName() {
        return Name;
    }

    /**
     *   Returns employee second name
     *
     *   @return                     employee second name
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     *   Returns employee date of birth
     *
     *   @return                     employee date of birth
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     *   Returns employee registration place
     *
     *   @return                     employee registration place
     */
    public String getRegPlace() {
        return regPlace;
    }

    /**
     *   Returns employee phone number
     *
     *   @return                     employee phone number
     */
    public long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *   Returns employee salary
     *
     *   @return                     employee salary
     */
    public double getSalary() {
        return Salary;
    }
}
