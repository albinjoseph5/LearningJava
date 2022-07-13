package assignmentJune10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MovieGuessingGame {

	public static void main(String[] args) throws FileNotFoundException {
		String[] movieList = new String[25];
		int i = 0;
		String flag = "y";
		File file = new File("C:\\Users\\tintu\\Documents\\movies.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
			movieList[i] = sc.nextLine();
			i++;
		}
//		for (int j = 0; j < movieList.length; j++) {
//			System.out.println(movieList[j]);
//		}
		GuessMovie guessmovie = new GuessMovie(movieList);
		while (flag.equals("y")) {
			flag = guessmovie.movieGame();
		}
		sc.close();
	}

}
