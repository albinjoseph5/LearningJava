
public class IfElseExamble {

	public static void main(String[] args) {
		int time = 24;
		if (time > 0 && time < 12) {
			System.out.println("Good morning");

		} else if (time >=12 && time < 18) {
			System.out.println("Good Afternoon");
		} else if (time >=18 && time <= 24) {
			System.out.println("Good night");
		} else {
			System.out.println("Invalid time");
		}

	}

}
