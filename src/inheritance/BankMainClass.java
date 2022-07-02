package inheritance;

public class BankMainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChequingAccount chqAccount = new ChequingAccount();
		chqAccount.depositMoney(1000);

		SavingAccount svngAccount = new SavingAccount();

		TFSA tfsa = new TFSA();
		tfsa.depositMoney(5000);

		String account = "TFSA";
		int pin = 6666;

		boolean isauthorized = chqAccount.authorization(pin, account);
		if (isauthorized && account.equals("Chequing")) {
			System.out.println("Balance in chequing : " + chqAccount.balance);
		} else if (isauthorized && account.equals("Saving")) {
			System.out.println("Balance in Saving : " + svngAccount.balance);
		} else if (isauthorized && account.equals("TFSA")) {
			System.out.println("Balance in TFSA : " + tfsa.balance);
		} else {
			System.out.println("Account Type and PIN didn't match");
		}
	}

}
