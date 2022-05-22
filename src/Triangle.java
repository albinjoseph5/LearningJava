
public class Triangle {

	public static void main(String[] args) {
		int base = 10;
		int hieght = 5;
		double hypotenuse;
		double area;
		double perimeter;

		area = 0.5 * base * hieght;
		int a = base * base + hieght * hieght;
		hypotenuse = Math.sqrt(a);
		perimeter = hypotenuse + base + hieght;

		System.out.println("Area = " + area+" square meters");
		System.out.println("Hypotenuse = " + hypotenuse+ " meters");
		System.out.println("Perimeter = " + perimeter+ " meters");

	}

}
