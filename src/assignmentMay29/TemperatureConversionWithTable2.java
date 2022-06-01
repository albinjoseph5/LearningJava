package assignmentMay29;

import java.util.Scanner;

public class TemperatureConversionWithTable2 {
	public static void main(String[] args) {
		double tempInFarenhiet = 0;
		double tempInCelsius = 0;
		int option = 0;
		Scanner in = new Scanner (System.in);
		System.out.println("Temperature Conversion");
		System.out.println("0.Conversion Table");
		System.out.println("1.Celsius to Farenheit");
		System.out.println("2.Farenheit to Celsius");
		System.out.println("Enter the option (0,1 or 2):");
		option = in.nextInt();
		if (option == 1) {
			System.out.println("Enter the temperature value in Celsius :");
			tempInCelsius = in.nextDouble();
			tempInFarenhiet = (tempInCelsius * 9 / 5) + 32;
			System.out.println("Temperature in Farenhiet is " + tempInFarenhiet + "°F");
		} else if (option == 2) {
			System.out.println("Enter the temperature value in Farenheit :");
			tempInFarenhiet = in.nextDouble();
			tempInCelsius = (tempInFarenhiet - 32) * 5 / 9;
			System.out.println("Temperature in Farenhiet is " + tempInCelsius + "°C");
		} else if (option == 0) {
			for(tempInCelsius=-20;tempInCelsius<=25;tempInCelsius+=5) {
				tempInFarenhiet = (tempInCelsius * 9 / 5) + 32;
				System.out.println(tempInCelsius +"\t\t"+tempInFarenhiet+"\n");
			}
		} else {
			System.out.println("Invalid Option");
		}
		in.close();

	}

}
