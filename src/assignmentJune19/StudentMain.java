package assignmentJune19;

public class StudentMain {

	public static void main(String[] args) {
		Student ralph = new Student("Ralph", 80, 70, 65, 70, 55);
		ralph.displayDetails();
		ralph.percentageCalculation();

		Student don = new Student("Don", 78, 67, 59, 40, 77);
		don.displayDetails();
		don.percentageCalculation();
	}

}
