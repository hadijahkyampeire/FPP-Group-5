package question2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        DeptEmployee p1 = new Professor("MAGIC", 15000.0, 9, 9, 2025, 0);
        DeptEmployee p2 = new Professor("OMEGA", 15000.0, 1, 9, 2025, 0);
        DeptEmployee P3 = new Professor("IVAN", 15000.0, 1, 1, 2025, 0);
        DeptEmployee s1 = new Secretary("HARRIET", 15000.0, 1, 1, 2025, 4);
        DeptEmployee s2 = new Secretary("JAMES", 15000.0, 1, 1, 2025, 3.5);

        DeptEmployee[] employees = new DeptEmployee[5];
        employees[0] = p1;
        employees[1] = p2;
        employees[2] = P3;
        employees[3] = s1;
        employees[4] = s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you wish to see the sum of all Professors and secretaries' salaries in the Dept? (y/n) ");
        String answer = sc.nextLine();

        double totalSalary = 0;
        if (answer.equalsIgnoreCase("y")) {
            for (DeptEmployee employee : employees) {
                totalSalary += employee.computeSalary();
            }
            System.out.println("Total Salary: " + "$" + totalSalary + "\n");
            System.out.println("The average salary is $" + totalSalary / employees.length);
        }
        sc.close();
    }
}
