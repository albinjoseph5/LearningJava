package assignmentJuly17;

import java.util.Random;

public class R2 extends Rocket {
	public R2() {
		cargoLimit = 29000;
		costOfRocket = 120;
	}

	@Override
	public boolean launch() {
		Random randomNumber = new Random();
		double rand = randomNumber.nextDouble();
		double chanceOfExplosion = 0.04 * cargoCarried / cargoLimit;
		return rand >= chanceOfExplosion;
	}

	@Override
	public boolean land() {
		Random randomNumber = new Random();
		double rand = randomNumber.nextDouble();
		double chanceOfExplosion = 0.08 * cargoCarried / cargoLimit;
		return rand >= chanceOfExplosion;
	}

}
