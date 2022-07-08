package assignmentJuly5;

public class PermanentEmployees extends Employee {
	
	public PermanentEmployees(String firstName, String lastName, double sinNumber) {
		super(firstName, lastName, sinNumber);

	}

	@Override
	void calculatePay() {
		biweeklySalary = salary / 26;

	}
}
