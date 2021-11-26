package Guess_Num_Game;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	boolean b = true;

	GuessGame() {
		Welcome();
		System.out.println("Guess number between 0 to 9.");
		PlayGame(1);
	}

	// Welcome to the player
	void Welcome() {
		System.out.print("Welcome From My Guess Game!!!" + "\n" + "Hello, What is your name" + "\n" + ">> ");
		String name = sc.nextLine();
		System.out.println();
		System.out.println("Hi! " + name);
		System.out.println("Let's play the guess game!");
	}

	// Main Game Loop
	void PlayGame(int round) {
		int num = r.nextInt(9);

		while (b) {
			System.out.print("> ");
			String s = sc.next();

			if (s.length() == 1) {
				CheckNum(s, round);
				int input = Integer.parseInt(s);

				if (input == num) {
					System.out.print("VICTORY" + "\n" + "Congratulations" + "\n" + "\n");
					PlayAgain(true);
				} else {
					round++;
					if (round >= 4) {
						System.out.print("DEFEAT" + "\n" + "\n");
						PlayAgain(true);
					} else {
						System.out.println("Try Again!");
					}
				}
			} else {
				System.out.println("Just Input One Number" + "\n");
			}
		}

	}

	// Checking input number or String
	void CheckNum(String s, int r) {
		char ch = s.charAt(0);
		char[] arr = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				i = arr.length + 1;
			} else {
				if (i == (arr.length - 1)) {
					System.out.println("Wrong Input!");
					PlayGame(r);
				}
			}
		}
	}

	// Asking for next game
	void PlayAgain(boolean ask) {
		while (ask) {
			System.out.print("Play next round? Yes or No: ");
			String str = sc.next();

			if (str.toUpperCase().equals("YES") || str.toUpperCase().equals("NO")) {

				if (str.toUpperCase().equals("YES")) {
					System.out.println("Guess number 0 to 9.");
					PlayGame(1);
				}
				else {
					System.out.println("Thanks alot for playing My Guess Game.");
					b = false;
					sc.close();
					break;
				}
				ask = false;

			} 
			else {
				System.out.println("Wrong Answer!");
			}
		}
	}

	public static void main(String[] args) {

		new GuessGame();

	}

}
