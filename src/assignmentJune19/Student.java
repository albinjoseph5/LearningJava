package assignmentJune19;

public class Student {
	String studentName;
	int marksOfEnglish;
	int marksOfPhysics;
	int marksOfChemistry;
	int marksOfMaths;
	int marksOfComputerScience;
	double percentage;

	Student(String name, int english, int physics, int chemistry, int maths, int computerScience) {
		studentName = name;
		marksOfEnglish = english;
		marksOfPhysics = physics;
		marksOfChemistry = chemistry;
		marksOfMaths = maths;
		marksOfComputerScience = computerScience;
	}

	void percentageCalculation() {
		percentage = (marksOfEnglish + marksOfPhysics + marksOfChemistry + marksOfMaths + marksOfComputerScience) * 0.2;
		System.out.println("Percentage : " + percentage);
	}

	void displayDetails() {
		System.out.println("\nName : " + studentName);
		System.out.println("**Marks**");
		System.out.println("English : " + marksOfEnglish);
		System.out.println("Physics : " + marksOfPhysics);
		System.out.println("Chemistry : " + marksOfChemistry);
		System.out.println("Mathematics : " + marksOfMaths);
		System.out.println("Computer Science : " + marksOfComputerScience);
	}
}
