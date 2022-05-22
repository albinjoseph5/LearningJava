import java.util.Scanner;

public class NewSalary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double perHourSalary;
		double hoursPerDay;
		double daysWorked;
		double weeklySalary;
		double takeHomeSalary;
		System.out.println("Enter per hour Salary:");
		perHourSalary = in.nextDouble();
		System.out.println("Enter the hours worked per day:");
		hoursPerDay = in.nextDouble();
		System.out.println("Enter the days worked per week:");
		daysWorked = in.nextDouble();
		weeklySalary = perHourSalary * hoursPerDay * daysWorked;
		takeHomeSalary = weeklySalary - (weeklySalary / 13);
		System.out.println("Weekly salary before deducting tax is " + weeklySalary);
		System.out.println("Take home salary after deducting tax is " + takeHomeSalary);
		in.close();

	}

}
