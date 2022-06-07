package assignmentJune5;

import java.util.Scanner;

public class Phones {

	public static void main(String[] args) {
		String[] phoneBrands = { "Samsung", "Google", "Apple" };
		String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
		String[] google = { "GooglePixel6", "GooglePixel6Pro", "GooglePixelPro", "GooglePixel5" };
		String[] apple = { "Iphone12", "Iphone12Mini", "Iphone11Pro", "Iphone11" };
		String brandSeachingFor = "";
		String brandNameSelected = "";
		String productName = "";
		boolean flag = false;
		Scanner in = new Scanner(System.in);
		System.out.println(
				"**Phone Brands**\nSamsung\nGoogle\nApple\nEnter the phone brand which you want to search for:");
		brandSeachingFor = in.next();
		for (int i = 0; i < phoneBrands.length; i++) {
			if (phoneBrands[i].equals(brandSeachingFor)) {
				brandNameSelected = phoneBrands[i];
			}
		}

		switch (brandNameSelected) {
		case "Samsung":
			for (int i = 0; i < samsung.length; i++) {
				System.out.println(samsung[i]);
			}
			System.out.println("Enter a product name from the list");
			productName = in.next();
			for (int i = 0; i < samsung.length; i++) {
				if (samsung[i].equals(productName)) {
					System.out.println("Product Selected is : " + samsung[i]);
					flag = true;
				}
			}
			if (flag == false) {
				System.out.println("Please select a product from the list!!!");
			}
			break;
		case "Google":
			for (int i = 0; i < google.length; i++) {
				System.out.println(google[i]);
			}
			System.out.println("Enter a product name from the list");
			productName = in.next();
			for (int i = 0; i < google.length; i++) {
				if (google[i].equals(productName)) {
					System.out.println("Product Selected is : " + google[i]);
					flag = true;
				}
			}
			if (flag == false) {
				System.out.println("Please select a product from the list!!!");
			}
			break;
		case "Apple":
			for (int i = 0; i < apple.length; i++) {
				System.out.println(apple[i]);
			}
			System.out.println("Enter a product name from the list");
			productName = in.next();
			for (int i = 0; i < apple.length; i++) {
				if (apple[i].equals(productName)) {
					System.out.println("Product Selected is : " + apple[i]);
					flag = true;
				}
			}
			if (flag == false) {
				System.out.println("Please select a product from the list!!!");
			}
			break;

		default:
			System.out.println("Enter the phone brand name from the list!!!");
			break;
		}
		in.close();
	}

}
