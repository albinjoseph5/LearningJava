package assignmentJune5;

import java.util.Arrays;

public class ArrayExamble {

	public static void main(String[] args) {

		// Two ways to declaring and initializing arrays are:
		// int[] fiveNumbers=new int[5];
		// int[] fiveNumbers={1,2,3,4,5}

		int[] fiveNumbers = new int[5];
		for (int i = 0; i < fiveNumbers.length; i++) {
			fiveNumbers[i] = i + 1;
		}
		for (int i = 0; i < fiveNumbers.length; i++) {
			System.out.println(fiveNumbers[i]);
		}

		String[] Cities = { "Toronto", "London", "Simco" };
		System.out.println(Arrays.toString(Cities));
	}

}
