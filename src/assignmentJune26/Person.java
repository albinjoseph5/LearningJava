package assignmentJune26;

public class Person {
	String name;
	private long accountNumber;
	double availableBalance;
	private int pinNumber;

	public Person(String name, long accountNumber, double availableBalance, int pinNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.availableBalance = availableBalance;
		this.pinNumber = pinNumber;
	}

	Person validatePin(Person[] person, int pin, long acccountNumber) {
		int flag = 0;
		for (int i = 0; i < person.length; i++) {
			if (person[i].pinNumber == pin && person[i].accountNumber == acccountNumber) {
				flag=1;
				return person[i];
			}
		}
		if(flag==0) {
			System.out.println("Wrong Pin!!!");
		}
		return null;

	}
}
