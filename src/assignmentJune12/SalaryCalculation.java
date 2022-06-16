package assignmentJune12;

import java.util.Scanner;

public class SalaryCalculation {
	public static void main(String[] args) {
		
		double hoursWorked;
		double salaryPerWeek;

		Scanner in = new Scanner(System.in);
		Employee employee1 = new Employee();

		System.out.println("Enter the First Name : ");
		employee1.firstName = in.next();
		System.out.println("Enter the Last Name : ");
		employee1.lastName = in.next();
		System.out.println("Enter the hourly rate : ");
		employee1.hourlyRate = in.nextDouble();
		System.out.println("Enter the hours worked this week : ");
		hoursWorked = in.nextDouble();
		

		salaryPerWeek = employee1.weeklysalary(hoursWorked);
		System.out.println("First Name : " + employee1.firstName);
		System.out.println("Last Name : " + employee1.lastName);
		System.out.println("Hourly Rate : " + employee1.hourlyRate);
		System.out.println("Salary Per Week : " + salaryPerWeek);
		

		in.close();

	}
	
}
