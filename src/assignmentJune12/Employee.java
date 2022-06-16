package assignmentJune12;

public class Employee {

	double salaryPerWeek;
	String firstName;
	String lastName;
	double hourlyRate;

	double weeklysalary( double hoursWorked) {
		salaryPerWeek = hourlyRate * hoursWorked;

		return salaryPerWeek;
	}

}
