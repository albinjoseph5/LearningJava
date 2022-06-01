package assignmentMay29;

import java.util.Scanner;

public class HieghtCalculation {

	public static void main(String[] args) {
		int hieghtInFeet = 0;
		int hieghtInInches = 0;
		double hieghtInCm = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your hieght(feet part) : ");
		hieghtInFeet = in.nextInt();
		System.out.println("Enter your hieght(inch part) : ");
		hieghtInInches = in.nextInt();
		System.out.println("Your hieght is " + hieghtInFeet + "Feet " + hieghtInInches + "inches");
		hieghtInCm = hieghtInFeet * 30.48 + hieghtInInches * 2.54;
		System.out.println("Your hieght in centimeters is " + hieghtInCm + "cm");
		in.close();
	}

}
