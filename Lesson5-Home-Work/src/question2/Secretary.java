package question2;

public class Secretary extends DeptEmployee {
    double overtimeHours;

    public Double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(Double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public Secretary(String name, double salary, int day, int month, int year, double overtimeHours) {
        super(name, salary, day, month, year);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double computeSalary() {
        return salary + (12 * overtimeHours);
    }
}
