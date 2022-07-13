package assignmentJune10;

import java.util.Random;
import java.util.Scanner;

public class GuessMovie {
	String[] movieList = new String[25];
	Random random = new Random();
	Scanner in = new Scanner(System.in);

	int randomNumber;
	String randomMovie;
	String guessMovie;
	char[] ch;
	char enteredCharacter;
	int incorrectEntries;
	int index;
	int indexOfthePreviousLetter;
	int flag1 = 0;
	String flag2 = "y";

	public GuessMovie(String[] movieList) {
		super();
		this.movieList = movieList;
	}

	String movieGame() {
		incorrectEntries = 0;

		randomMovieSelectionAndUnderscoreConversion();

		System.out.println("***Guess The Movie***");
		do {
			System.out.println("You are guessing : " + guessMovie.replaceAll("", " "));
			System.out.println("Guess a letter : ");
			try {
				enteredCharacter = in.nextLine().charAt(0);
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("Please enter a letter!!!\n");
			}
			// System.out.println(enteredCharacter);

			compareAndConvertString();

			System.out.println("You have guessed ( " + incorrectEntries + " ) wrong letters");
			if (randomMovie.equals(guessMovie)) {
				System.out.println("\nYou have guessed the movie '" + guessMovie + "' correctly!!!\n");
				System.out.println("Would you like to play again ? (y/n)");
				flag2 = in.nextLine();
//				flag2 = "n";
				break;
			}

		} while (incorrectEntries < 10);
		if (incorrectEntries == 10) {
			System.out.println("\nYou have ran out of attempts!!!");
			System.out.println("\nThe Movie is '" + randomMovie + "'");
			System.out.println("\nWould you like to play again ? (y/n)");
			flag2 = in.nextLine();
		}

		return flag2;

	}

	void randomMovieSelectionAndUnderscoreConversion() {
		randomNumber = random.nextInt(25);
		randomMovie = movieList[randomNumber];
//		randomMovie="the dark knight";
//		System.out.println(randomMovie);
//		System.out.println(randomMovie.length());
		ch = randomMovie.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				ch[i] = '_';
			}
		}
		guessMovie = String.valueOf(ch);
	}

	void compareAndConvertString() {
		indexOfthePreviousLetter = 0;
		for (int i = 0; i < ch.length; i++) {
			flag1 = 0;
			if (ch[i] == enteredCharacter) {
				indexOfthePreviousLetter = i + 1;
			}
		}
		index = randomMovie.indexOf(enteredCharacter, indexOfthePreviousLetter);
//		 System.out.println(index);

		for (int i = 0; i < randomMovie.length(); i++) {

			if (index != -1) {
				ch[index] = enteredCharacter;
			} else {
				flag1 = 1;
			}

		}
		if (flag1 == 1) {
			incorrectEntries++;
		}
		guessMovie = String.valueOf(ch);
	}

}
