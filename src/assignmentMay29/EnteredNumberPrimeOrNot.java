package assignmentMay29;

import java.util.Scanner;

public class EnteredNumberPrimeOrNot {

	public static void main(String[] args) {
		int number;
		int j = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number = in.nextInt();
		for (int i = 2; i <number; i++) {
			if (number % i == 0) {
				j = 0;
			}
		}
		if (j == 0||number==0||number==1) {
			System.out.println("Entered number is not prime");
		} else {
			System.out.println("Entered number is prime");
		}
		in.close();
	}

}
