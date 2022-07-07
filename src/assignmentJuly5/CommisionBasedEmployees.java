package assignmentJuly5;

public class CommisionBasedEmployees extends Employee {
	double sales;

	public CommisionBasedEmployees(String firstName, String lastName, double sinNumber, double sales) {
		super(firstName, lastName, sinNumber);
		this.sales = sales;
	}

	@Override
	void calculatePay() {
		biweeklySalary = salary / 24 + sales * 0.15;

	}
}
