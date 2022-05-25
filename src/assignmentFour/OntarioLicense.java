package assignmentFour;

public class OntarioLicense {

	public static void main(String[] args) {
		String currentLicense = "G1";
		int drivingExperience = 12;
		int age = 29;
		if (age >= 16) {
			if (currentLicense == "G2") {
				if (drivingExperience >= 12) {
					System.out.println("Eligible to apply for G license");
				} else {
					System.out.println("Need to have 12 months of driving experience");
				}
			} else if (currentLicense == "G1") {
				if (drivingExperience >= 12) {
					System.out.println("Eligible to apply for G2 license");
				} else {
					System.out.println("Need to have 12 months of driving experience");
				}
			} else {
				System.out.println("Eligible to apply for G1 license");
			}

		} else {
			System.out.println("Need to have atleast 16 years of age to apply for driver's license");
		}
	}

}
