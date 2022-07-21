package assignmentJuly17;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Item> allItems= new ArrayList<Item>();
		Simulation s = new Simulation();
		try {
			allItems = s.loadItems();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<Rocket> R1Rockets = s.loadU1(allItems);
		double budgetOfR1 = s.runSimulation(R1Rockets);
//		System.out.println(R1Rockets.toString());
		System.out.println("Total cost for R1 fleet, phase 1: $"+budgetOfR1);
		ArrayList<Rocket> R2Rockets = s.loadU2(allItems);
		double budgetOfR2 = s.runSimulation(R2Rockets);
//		System.out.println(R2Rockets.toString());
		System.out.println("Total cost for R2 fleet, phase 1: $"+budgetOfR2);

	}

}
