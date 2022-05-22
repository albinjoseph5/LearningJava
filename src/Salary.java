
public class Salary {

	public static void main(String[] args) {
		double perHourSalary = 14;
		double hoursPerDay = 8, daysWorked = 5;
		double weeklySalary, takeHomeSalary;
		weeklySalary = perHourSalary * hoursPerDay * daysWorked;
		takeHomeSalary = weeklySalary - (weeklySalary / 10);
		System.out.println("Weekly salary before deducting tax is " + weeklySalary);
		System.out.println("Take home salary after deducting tax is " + takeHomeSalary);

	}

}
