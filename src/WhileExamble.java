
public class WhileExamble {

	public static void main(String[] args) {
		int maxCapacity=100;
		int bucketCapacity=10;
		int currentCapacity=10;
		while(currentCapacity<maxCapacity) {
			if(currentCapacity>=90) {
				break;
			}
			currentCapacity+=bucketCapacity;
		}
		System.out.println(currentCapacity);
	}

}
