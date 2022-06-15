package assignmentJune12;

import java.util.Scanner;

public class Employee1 {
	static double salaryPerWeek;

	public static void main(String[] args) {
		String firstName = "";
		String lastName = "";

		double hourlyRate;
		double hoursWorked;

		double salaryPerWeek;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the First Name : ");
		firstName = in.next();
		System.out.println("Enter the Last Name : ");
		lastName = in.next();
		System.out.println("Enter the hourly rate : ");
		hourlyRate = in.nextDouble();
		System.out.println("Enter the hours worked this week : ");
		hoursWorked = in.nextDouble();

		salaryPerWeek = weeklysalary(hourlyRate, hoursWorked);
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name : " + lastName);
		System.out.println("Hourly Rate : " + hourlyRate);
		System.out.println("Salary Per Week : " + salaryPerWeek);

		in.close();
	}

	static double weeklysalary(double rate, double hoursWorked) {
		salaryPerWeek = rate * hoursWorked;

		return salaryPerWeek;
	}
}