package question2;

import java.time.LocalDate;

public class DeptEmployee {
    String name;
    double salary;
    LocalDate hireDate;


    public DeptEmployee(String name, double salary, int day, int month, int year) {
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double computeSalary() {
        return salary;
    }
}
