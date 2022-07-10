package randomExambles;

import java.util.Random;

public class RandomEmailAddress {

	public static void main(String[] args) {
		Random random = new Random();
		String charList = "abcdefghijklmnopqrstuvwxyz";
		int randomNumber = random.nextInt(99);
		int randomStringLength = 10;
		int randomInt;
		StringBuffer randomString = new StringBuffer();
		char ch;
		for (int i = 0; i < randomStringLength; i++) {
			randomInt = random.nextInt(charList.length());
			ch = charList.charAt(randomInt);
			randomString.append(ch);
		}
		System.out.println(randomString.toString() + randomNumber + "@gmail.com");
	}

}
