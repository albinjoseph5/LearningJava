package assignmentJune26;

import java.util.Scanner;

public class AtmMain {

	public static void main(String[] args) {
		int pinNumber;
		long accountNumber;
		int option;
		String flag = "y";

		Person person1 = new Person("Albin", 987654, 1000, 1234);
		Person person2 = new Person("Jithin", 123456, 3000, 4321);
		Person[] person = { person1, person2 };

		Scanner in = new Scanner(System.in);
		AtmOperations operation = new AtmOperations();

		System.out.println("Enter the account number : ");
		accountNumber = in.nextLong();
		System.out.println("Enter the PIN number : ");
		pinNumber = in.nextInt();
		Person returnedPerson = person1.validatePin(person, pinNumber, accountNumber);
		while (flag.equals("y")) {
			if (returnedPerson != null) {
				operation.homePage();
				option = in.nextInt();
				switch (option) {
				case 1:
					operation.depositCash(returnedPerson);
					break;
				case 2:
					operation.withdrawCash(returnedPerson);
					break;
				case 3:
					operation.currentBalance(returnedPerson);
					break;
				default:
					System.out.println("Invalid option!!!");
					break;
				}
			}
			System.out.println("Would like to do another transaction (y/n)?");
			flag = in.next();
		}
		in.close();
	}

}
