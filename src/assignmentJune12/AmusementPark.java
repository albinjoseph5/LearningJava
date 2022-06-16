package assignmentJune12;

import java.util.Scanner;

public class AmusementPark {

	public static void main(String[] args) {
		boolean isRequiredHieght;
		boolean isRequiredWeight;
		Scanner in = new Scanner(System.in);
		Person person1 = new Person();

		AmusementParkRides rollercoaster = new AmusementParkRides();
		System.out.println("Welcome to the Amusement Park Rides");
		System.out.println("Enter your hieght : ");
		person1.hieght = in.nextInt();
		System.out.println("Enter the weight : ");
		person1.weight = in.nextInt();
		person1.weight = 80;
		isRequiredHieght = rollercoaster.hieghtCheck(person1.hieght);
		isRequiredWeight = rollercoaster.weightCheck(person1.weight);
		if (isRequiredHieght == true && isRequiredWeight == true) {
			System.out.println("You are allowed to enter the ride");
		} else {
			System.out.println("You are not allowed to the ride");
		}

		in.close();
	}

}
