package randomExambles;
import java.util.Random;

public class RandomExambles {

	public static void main(String[] args) {
		Random random = new Random();

		// It generates boolean value
		System.out.println(random.nextBoolean());

		// It generates double value
		System.out.println(random.nextDouble());

		// It generates float value
		System.out.println(random.nextFloat());

		// It generates int value
		System.out.println(random.nextInt());

		// It generates int value within specific limit
		System.out.println(random.nextInt(50));

		// It generates String value
		String charList = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int randomStringLength = 10;
		int randomInt;
		StringBuffer randomString = new StringBuffer();
		char ch;
		for (int i = 0; i < randomStringLength; i++) {
			randomInt = random.nextInt(charList.length());
			ch = charList.charAt(randomInt);
			randomString.append(ch);
		}
		System.out.println(randomString);

	}

}
