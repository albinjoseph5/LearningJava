package assignmentJune12;

public class AreaOfRectangle {

	public static void main(String[] args) {
		double length1 = 5;
		double breadth1 = 4;

		double length2 = 8;
		double breadth2 = 5;

		double area1;
		double area2;

		Rectangle firstRectangle = new Rectangle();
		Rectangle secondRectangle = new Rectangle();

		area1 = firstRectangle.area(length1, breadth1);
		area2 = secondRectangle.area(length2, breadth2);

		System.out.println("Area of first Rectangle : " + area1);
		System.out.println("\nArea of second Rectangle : " + area2);

	}

}
