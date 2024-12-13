package Prob2;

import Prob1.Student;

import java.util.Comparator;

public class SsnComparator  implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSsn().compareTo(o2.getSsn());
    }
}
