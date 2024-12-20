package question4;

public class HourlyEmployee extends Employee {
    double wage;
    double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    double getPayment() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return String.format("Hourly Employee: %s\n Wage: %.2f; \n Hours: %.2f \n Salary: %.2f \n",
                super.toString(), getWage(), getHours(), getPayment());
    }
}
