package assignmentFour;

public class CounterForShop {

	public static void main(String[] args) {
		int maxCapacity = 100; // Assumed maximum capacity of store is 100
		int currentNumber = 40; // We can vary current number of customers in the store
		int newCustomers = 7; // We can vary No. of customers entering the store
		while (currentNumber <= maxCapacity) {
			System.out.println("Current Number of Customers :" + currentNumber);
			currentNumber += newCustomers;
			if (currentNumber >= 50) {
				System.out.println("Maximum capacity reached");
				break;
			}
		}

	}

}
