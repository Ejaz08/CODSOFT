package game_number;

import java.util.Random;
import java.util.Scanner;

public class Guess_number {
	 static void game() {

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int numberofrounds = 0;
		while (true) {
			int randomnumber = rand.nextInt(100) + 1;
			System.out.println("guess a number between 1 to 100");

			int userguess = sc.nextInt();
			numberofrounds++;
			if (userguess == randomnumber) {
				System.out.println("win the game");
				System.out.println("limit of attempts left: " + numberofrounds);
				break;
			} else if (userguess < randomnumber) {
				System.out.println("Guess is too high.");
			} else {
				System.out.println("Guess is too low.");
			}
		}
		sc.close();
	}
	 public static void main(String[] args) {
		
		 Guess_number.game();
	}
}
