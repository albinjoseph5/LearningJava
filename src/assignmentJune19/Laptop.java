package assignmentJune19;

public class Laptop {
	String laptopName;
	int ramSize;
	String processorType;

	Laptop() {
		System.out.println("\nConstructor created");
	}

	Laptop(String name, int size, String type) {
		System.out.println("\nParameterized Constructor created");
		laptopName = name;
		ramSize = size;
		processorType = type;
	}

	void initialize(String name, int size, String type) {
		laptopName = name;
		ramSize = size;
		processorType = type;
	}

	void displayDetails() {
		System.out.println("Laptop Name : " + laptopName);
		System.out.println("Ram Size : " + ramSize + "GB");
		System.out.println("Processor Type : " + processorType);
	}

}
