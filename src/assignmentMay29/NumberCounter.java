package assignmentMay29;

import java.util.Scanner;

public class NumberCounter {

	public static void main(String[] args) {
		int i = 0;
		int numberEntered = 0;
		String exit = "";
		int count = 0;
		System.out.println("Enter the numbers and press Q when you finish entering:");
		Scanner in = new Scanner(System.in);
		do {
			if (in.hasNextInt()) {
			numberEntered = in.nextInt();
				count++;
			} else {
				exit = in.next();
				if (exit.equals("Q")) {
					break;
				} else {
					System.out.println("Please enter a number:");
				}
			}

		} while (i == 0);
		System.out.println("Total numbers entered is: " + count);
		in.close();
	}

}
