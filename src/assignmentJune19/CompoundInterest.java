package assignmentJune19;

public class CompoundInterest {
	double totalAmount;

	double compoundInterest(double principal, double rate, int timeInYears) {
		int n = 12;
		double r = rate / 100;
		// System.out.println(r);
		double x = 1;
		// System.out.println(x);
		for (int i = 0; i < 12 * timeInYears; i++) {
			x *= (1 + r / n);
		}
		totalAmount = principal * x;
		return totalAmount;
	}
}
