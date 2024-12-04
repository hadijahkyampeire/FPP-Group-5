package question4;

public class SalariedEmployee extends Employee {
    double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

//    @Override
    public double getPayment() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return String.format("Salaried Employee: %s\n Weekly Salary: %.2f \n Salary: %.2f \n",
                super.toString(), getWeeklySalary(), getPayment());
    }
}
