package forLoopExamble;

public class ForLoopExamble {

	public static void main(String[] args) {
		double loanAmount = 20000;
		double loanPaid=0;

		for (int i = 0; i < 3; i++) {
			loanPaid=loanAmount*0.1;
			loanAmount=loanAmount-loanPaid;
		}
		System.out.println("Remaining loan amount to be paid after 3 months: "+loanAmount);
	}

}
