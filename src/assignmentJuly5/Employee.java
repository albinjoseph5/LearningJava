package assignmentJuly5;

public class Employee {
	String firstName;
	String lastName;
	double sinNumber;
	double salary;
	double monthlySalary;
	double biweeklySalary;

	public Employee(String firstName, String lastName, double sinNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.sinNumber = sinNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Salary could not be a negative value");
		}
	}

	void calculatePay() {
		monthlySalary = salary / 12;

	}

	public double getBiweeklySalary() {
		return biweeklySalary;
	}

}
