package question4;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    double getPayment() {
        return  baseSalary + (grossSales * commissionRate) ;
    }

    @Override
    public String toString() {
        return String.format("Base-Salaried Commission Employee: %s Base Salary: %.2f \n Salary: %.2f \n",
                super.toString(), getBaseSalary(), getPayment());
    }
}
