package assignmentJune26;

import java.util.Scanner;

public class AtmOperations {
	int option;
	Scanner in = new Scanner(System.in);
	double withdraw;
	double deposit;

	void withdrawCash(Person person) {
		System.out.print("Enter cash to be withdrawn:");
		withdraw = in.nextInt();
		if (withdraw <= 1000) {
			if (person.availableBalance >= withdraw) {
				person.availableBalance = person.availableBalance - withdraw;
				System.out.println("Please collect your cash");
			} else {
				System.out.println("Insufficient Balance");
			}
		} else {
			dailyLimit();
		}
		currentBalance(person);
	}

	void dailyLimit() {
		System.out.println("Daily withdraw limit is $1000");
	}

	void depositCash(Person person) {
		System.out.print("Enter cash to be deposited:");
		deposit = in.nextInt();
		person.availableBalance = person.availableBalance + deposit;
		System.out.println("Your cash has been successfully deposited");
		currentBalance(person);
	}

	void currentBalance(Person person) {
		System.out.println("Current Balance : " + person.availableBalance);
	}

	void homePage() {
		System.out.println("**Home Page**");
		System.out.println("1.Deposit Cash");
		System.out.println("2.Withdraw Cash");
		System.out.println("3.Balance Enquiry");
		System.out.println("Select the options 1, 2 or 3");
	}
}
