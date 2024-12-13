package Prob2;

import java.util.*;

public class EmployeeAdmin {
	
	/**
		
	Your method prepareReport should return a list of all Employees in the input table 
	whose social security number is in the input list socSecNums and whose salary is greater than $80,000. 
	In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		if (socSecNums.isEmpty() || table.isEmpty()) return new ArrayList<>();

		List<Employee> employees = new ArrayList<>();

		table.values().forEach(employee -> {
			if (socSecNums.contains(employee.getSsn()) && employee.getSalary()  > 80000) {
				employees.add(employee);
			}
		});
		employees.sort(new SsnComparator());

		return employees;
	}
}
