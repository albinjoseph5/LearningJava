package assignmentJune19;

public class LaptopMain {

	public static void main(String[] args) {

		Laptop dell = new Laptop();
		dell.laptopName = "Dell";
		dell.ramSize = 16;
		dell.processorType = "Intel i7";
		dell.displayDetails();

		Laptop hp = new Laptop();
		hp.initialize("HP", 8, "Intel i5");
		hp.displayDetails();

		Laptop acer = new Laptop("Acer", 32, "Intel i9");
		acer.displayDetails();
	}

}
