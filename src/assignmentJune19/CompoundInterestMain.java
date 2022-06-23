package assignmentJune19;

public class CompoundInterestMain {

	public static void main(String[] args) {
		double totalAmount;

		CompoundInterest obj1 = new CompoundInterest();
		totalAmount = obj1.compoundInterest(5000, 5, 10);
		System.out.println("Total Amount = " + totalAmount);

	}

}
