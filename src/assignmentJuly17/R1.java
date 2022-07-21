package assignmentJuly17;

import java.util.Random;

public class R1 extends Rocket {
	public R1() {
		cargoLimit = 18000;
		costOfRocket = 100;
	}

	@Override
	public boolean launch() {
		Random randomNumber = new Random();
		double rand = randomNumber.nextDouble();
		double chanceOfExplosion = 0.5 * cargoCarried / cargoLimit;
//		System.out.println(chanceOfExplosion);
//		System.out.println(rand);
		return rand >= chanceOfExplosion;
	}

	@Override
	public boolean land() {
		Random randomNumber = new Random();
		double rand = randomNumber.nextDouble();
		double chanceOfExplosion = 0.1 * cargoCarried / cargoLimit;
		return rand >= chanceOfExplosion;
	}

}
