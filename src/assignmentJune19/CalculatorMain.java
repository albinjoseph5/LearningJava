package assignmentJune19;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		String operator = "";
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		Calculator calc = new Calculator();
		Scanner in = new Scanner(System.in);
		System.out.println("Calculator");
		System.out.println("Enter the first number:");
		firstNumber = in.nextDouble();
		System.out.println("Enter the second number:");
		secondNumber = in.nextDouble();
		System.out.println("(+)Addition\n(-)Substraction\n(*)Multiplication\n(/)Division");
		System.out.println("Choose an operator + , - , * , or / :");
		operator = in.next();
		switch (operator) {
		case "+":
			result = calc.addition(firstNumber, secondNumber);
			System.out.println("The result is:\n" + firstNumber + " " + operator + " " + secondNumber + " = " + result);
			break;
		case "-":
			result = calc.subtraction(firstNumber, secondNumber);
			System.out.println("The result is:\n" + firstNumber + " " + operator + " " + secondNumber + " = " + result);
			break;
		case "*":
			result = calc.multipication(firstNumber, secondNumber);
			System.out.println("The result is:\n" + firstNumber + " " + operator + " " + secondNumber + " = " + result);
			break;
		case "/":
			if (secondNumber == 0) {
				System.out.println("Not able to divide!!!\nDivisor should not be zero");
			} else {
				result = calc.division(firstNumber, secondNumber);
				System.out.println(
						"The result is:\n" + firstNumber + " " + operator + " " + secondNumber + " = " + result);
			}
			break;
		default:
			System.out.println("Enter a valid operator!!!!");
			break;
		}
		in.close();
	}

}
