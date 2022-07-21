package assignmentJuly17;

public class Rocket implements SpaceShip {
	double cargoCarried = 0;
	double cargoLimit;
	double costOfRocket;
//	double totalWeight;

	public double getCostOfRocket() {
		return costOfRocket;
	}

	public void setCostOfRocket(double costOfRocket) {
		this.costOfRocket = costOfRocket;
	}

	@Override
	public boolean launch() {
		return true;
	}

	@Override
	public boolean land() {
		return true;
	}

	@Override
	public boolean canCarry(Item item) {
		double weight = cargoCarried + item.getWeight();
		return weight <= cargoLimit;
	}

	@Override
	public double carry(Item item) {
		cargoCarried += item.getWeight();
		return cargoCarried;
	}

}
