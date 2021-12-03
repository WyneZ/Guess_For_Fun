import java.util.Random;
import java.util.Scanner;

public class GG_Text {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		char[] arr = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		System.out.print("Welcome From My Guess Game!!!" + "\n" + "Hello, What is your name" + "\n" + ">> ");
		String name = sc.nextLine();
		System.out.println();
		System.out.println("Hi! " + name);
		System.out.println("Let's play the guess game!");

		boolean kk = true;

		while (kk) {

			int num = r.nextInt(9);
			int j = 0;
			boolean b = true;

			System.out.println("Guess the number between 0 to 9");

			while (b) {
				System.out.print("> ");
				String s = sc.next();
				int a;

				for (int i = 0; i < s.length(); i++) {
					char ch = s.charAt(i);
					int q = 0;

					for (char c : arr) {

						if (c == ch) {
							if (s.length() < 2) {
								a = Integer.parseInt(String.valueOf(ch));

								if (a == num) {
									System.out.print("👑👑👑VICTORY👑👑👑" + "\n"
											+ "👏👏👏👏👏 Congratulations 👏👏👏👏👏" + "\n" + "\n");
									b = false;
								} else {
									j++;
									if (j == 3) {
										System.out.print("😢😢😢DEFEAT😢😢😢" + "\n" + "\n");
										b = false;
									} else {
										System.out.println("Try Again!");
									}
								}
							} else {
								System.out.println("Just Input Only One Number" + "\n");
								i = s.length() + 1;
							}

						} else {
							q++;
							if (q == 10) {
								System.out.println("wrong input!!!!");
								i = s.length() + 1;
							}
						}
					}
				}
			}

			boolean c = true;
			while (c) {
				System.out.print("Play next round? Yes or No: ");
				String str = sc.next();

				if (str.toUpperCase().equals("YES") || str.toUpperCase().equals("NO")) {
					if (str.toUpperCase().equals("YES")) {
						break;
					} else {
						System.out.println("Thanks alot for playing MY Guess Game.😀");
						kk = false;
					}
					c = false;
				} else {
					System.out.println("Wrong Answer!");
				}
			}

		}
		sc.close();
	}
}
