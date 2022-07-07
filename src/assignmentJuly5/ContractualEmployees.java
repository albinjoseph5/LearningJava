package assignmentJuly5;

public class ContractualEmployees extends Employee {
	double hoursWorked;

	public ContractualEmployees(String firstName, String lastName, double sinNumber, double hoursWorked) {
		super(firstName, lastName, sinNumber);
		this.hoursWorked = hoursWorked;
	}

	@Override
	void calculatePay() {
		if (hoursWorked <= 40) {
			biweeklySalary = salary * hoursWorked * 2;
		} else {
			hoursWorked = hoursWorked - 40;
			biweeklySalary = 80 * salary + hoursWorked * salary * 3;
		}

	}

}
