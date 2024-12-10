package prob3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Marketing> marketings = new ArrayList<>();

        Marketing marketing1 = new Marketing("John Doe", "Cars", 2000.0);
        Marketing marketing2 = new Marketing("Jane Doe", "Bags", 5000.0);
        Marketing marketing3 = new Marketing("Dinah Doe", "Airtime", 1000.0);
        Marketing marketing4 = new Marketing("Peter Tim", "Cars", 2000.0);
        Marketing marketing5 = new Marketing("Tom Tommy", "Bags", 5000.0);
        Marketing marketing6 = new Marketing("Rinah Tanny", "Airtime", 1000.0);

        marketings.add(marketing1);
        marketings.add(marketing2);
        marketings.add(marketing3);
        marketings.add(marketing4);
        marketings.add(marketing5);
        marketings.add(marketing6);

        System.out.println("Before removing an object \n" + marketings + "\n Size(): " + marketings.size());
        marketings.remove(marketing1);
        System.out.println("\n After removing \n" + marketings + "\n Size(): " + marketings.size() + "\n");

        // Retrieve marketing object in position 4
        System.out.println("Marketing Object at position 4: "+ marketings.get(4));

        // Update the details of the marketing obj at position 0
        Marketing updatedMarketing = new Marketing("Jane Doe(Updated Name)", "Machines", 3000.0);
        marketings.set(0, updatedMarketing);
        System.out.println("After updating the first object: " + marketings);

        // Sorting
        Comparator<Marketing> myComparator = new SalesAmountComparator();
        marketings.sort(myComparator);

        System.out.println("\n After comparing by SALES AMOUNT: " + marketings + "\n");

        // Get employees who are getting above 1000
        ArrayList<Marketing> emps =  Marketing.getEmployeesMarketing(marketings);

        /* LAMDA
        emps.sort(Comparator.comparing((Marketing m) -> m.getEmployeename()));
         */
        emps.sort(Comparator.comparing(Marketing::getEmployeename));
        System.out.println("\n After comparing by NAME Employees with sales amount > $1000: \n" + emps + "\n");

    }
}
