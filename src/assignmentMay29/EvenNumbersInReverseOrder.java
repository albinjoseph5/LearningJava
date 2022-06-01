package assignmentMay29;

public class EvenNumbersInReverseOrder {

	public static void main(String[] args) {
		System.out.println("Even numbers in reverse order:");
		for(int i=100;i>=0;i--) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
