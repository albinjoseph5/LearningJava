package assignmentJuly17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
	

	ArrayList<Item> loadItems() throws FileNotFoundException {
		ArrayList<Item> allItems = new ArrayList<Item>();
		File file = new File("C:\\Users\\tintu\\OneDrive\\Desktop\\Testing\\phase-1.txt");
		Scanner sc = new Scanner(file);
//		int i = 0;
		String[] nameAndWeight;
//		String weight;
		Item item;

		while (sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
			nameAndWeight = sc.nextLine().split("=");
//			System.out.println(nameAndWeight[0]);
//			System.out.println(Integer.valueOf(nameAndWeight[1]));
			item = new Item(nameAndWeight[0], Integer.valueOf(nameAndWeight[1]));
			allItems.add(item);
		}
		sc.close();
		return allItems;
	}

	ArrayList<Rocket> loadU1(ArrayList<Item> allItems) {
		ArrayList<Rocket> R1Rockets = new ArrayList<Rocket>();
		R1 rocket1 = new R1();
		for (Item itemList : allItems) {
			if (rocket1.canCarry(itemList)) {
				rocket1.carry(itemList);
			} else {
				R1Rockets.add(rocket1);
				rocket1 = new R1();
			}
		}
		R1Rockets.add(rocket1);
		return R1Rockets;
	}

	ArrayList<Rocket> loadU2(ArrayList<Item> allItems) {
		ArrayList<Rocket> R2Rockets = new ArrayList<Rocket>();
		R2 rocket2 = new R2();
		for (Item itemList : allItems) {
			if (rocket2.canCarry(itemList)) {
				rocket2.carry(itemList);
			} else {
				R2Rockets.add(rocket2);
				rocket2 = new R2();
			}
		}
		R2Rockets.add(rocket2);
		return R2Rockets;
	}

	double runSimulation(ArrayList<Rocket> rockets) {
		double budget = 0;
		boolean isLaunched = false;
		boolean isLanded = false;
//		Rocket rocket1;
		int numberOfRocketsCrashed = 0;
		for (Rocket rocket : rockets) {
			isLaunched = rocket.launch();
			isLanded = rocket.land();
//			System.out.println(isLanded);
//			System.out.println(isLaunched);
			budget += rocket.getCostOfRocket();
			if (!isLanded || !isLaunched) {
//				System.out.println(rocket.getClass().getName());
//				if (rocket.getClass().getName().equals("assignmentJuly17.R1")) {
//					Rocket rocket1=new R1();
//					rockets.add(rocket1);
//				rockets.add(rocket1);
//				}
				numberOfRocketsCrashed++;
				budget += rocket.getCostOfRocket();
			}
		}
		System.out.println("Number of rockets crashed : " + numberOfRocketsCrashed);
		return budget;
	}
}
