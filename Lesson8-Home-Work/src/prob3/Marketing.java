package prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Marketing {
	private String employeename;
	private String productname;
	private double salesamount;

	public Marketing(String employeename, String productname, double salesamount) {
		this.employeename = employeename;
		this.productname = productname;
		this.salesamount = salesamount;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getSalesamount() {
		return salesamount;
	}

	public void setSalesamount(double salesamount) {
		this.salesamount = salesamount;
	}

	public static ArrayList<Marketing> getEmployeesMarketing(ArrayList<Marketing> marketings) {
		ArrayList<Marketing> employeesMarketing = new ArrayList<>();
		for (Marketing marketing : marketings) {
			if(marketing.getSalesamount() > 1000) {
				employeesMarketing.add(marketing);
			}
		}
		return employeesMarketing;
	}

	@Override
	public String toString() {

		return employeename + " " + productname + " " + "$"+salesamount + "\n";
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Marketing marketing = (Marketing) o;
		return Double.compare(salesamount, marketing.salesamount) == 0 && Objects.equals(employeename, marketing.employeename) && Objects.equals(productname, marketing.productname);
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeename, productname, salesamount);
	}
}