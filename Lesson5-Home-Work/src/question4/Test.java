package question4;

public class Test {
    public static Employee findMaxSalary (Employee[] col) {
        double maxSalary = 0;
        Employee empWithMaxSalary = null;

        for (Employee employee : col) {
           if(employee.getPayment() > maxSalary) {
               maxSalary = employee.getPayment();
               empWithMaxSalary = employee;
           }
        }
        return empWithMaxSalary;
    }

    public static void main(String[] args) {
        Employee e1 = new SalariedEmployee("Marie", "Natu", "123456789", 10000 );
        Employee e2 = new CommissionEmployee("Hadi", "Omega", "987654321", 100, 200);
        Employee e3 = new HourlyEmployee("Namu", "Mariam", "234567891", 120, 30);
        Employee e4 = new BasePlusCommissionEmployee("Qwerty", "ytrewq", "9876123456", 12, 90, 200);
        Employee e5 = new SalariedEmployee("poiuyt", "qwerty", "123456789", 10000);

        Employee[] employees = {e1, e2, e3, e4, e5};

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        System.out.println("The employee with max salary is: " + findMaxSalary(employees).toString());
    }
}
