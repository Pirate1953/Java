package ru.mirea.IKBO1719.task11;

public class Employee {
    String SecondName;
    String Name;
    double baseSalary;
    EmployeePosition Position;

    /*
    *   Constructs employee and sets his name, second name, salary and position, calculates employee salary according to the fixed salary
    *
    *   Parameters: SecondName - second name (String)
    *               Name - name (String)
    *               baseSalary - fixed salary (double)
    *               Position - position of employee (EmployeePosition interface object)
    */
    public Employee(String SecondName, String Name, double baseSalary, EmployeePosition Position) {
        this.SecondName = SecondName;
        this.Name = Name;
        this.baseSalary = baseSalary;
        this.Position = Position;
        Position.calcSalary(baseSalary);
    }

    /*
    *   Returns employee name
    *
    *   Parameters: no
    *
    *   Return: String
    */
    public String getName() {
        return this.Name;
    }

    /*
     *   Sets employee second name
     *
     *   Parameters: name - employee name (String)
     *
     *   Return: void
     */
    public void setName(String name) {
        this.Name = name;
    }

    /*
     *   Returns employee second name
     *
     *   Parameters: no
     *
     *   Return: String
     */
    public String getSecondName() {
        return this.SecondName;
    }


    /*
     *   Sets employee second name
     *
     *   Parameters: secondName - second name (String)
     *
     *   Return: void
     */
    public void setSecondName(String secondName) {
        this.SecondName = secondName;
    }

    /*
    *   Returns fixed salary
    *
    *   Parameters: no
    *
    *   Return: double
    */
    public double getBaseSalary() {
        return this.baseSalary;
    }

    /*
    *   Sets fixed salary
    *
    *   Parameters: baseSalary - fixed salary to set (double)
    *
    *   Return: no
    */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /*
     *   Returns employee position
     *
     *   Parameters: no
     *
     *   Return: EmployeePosition interface object
     */
    public EmployeePosition getPos() {
        return this.Position;
    }

    /*
     *   Sets employee position
     *
     *   Parameters: pos - EmployeePosition interface object
     *
     *   Return: no
     */
    public void setPos(EmployeePosition pos) {
        this.Position = pos;
    }
}
