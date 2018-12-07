package academy.mate.hw01;

import java.util.Scanner;

public class PalindromTest {

	public static void main(String[] args) {

		char fromStart;
		char fromEnd;
		boolean flagOfEquals = true;

		System.out.print("Enter your word for check on Palindrom:  ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();

		for (int i = 0; i < word.length() / 2; i++) {
			fromStart = word.charAt(i);
			fromEnd = word.charAt(word.length() - 1 - i);
			if (fromStart != fromEnd) {
				flagOfEquals = false;
				break;
			}
		}

		if (flagOfEquals) {
			System.out.println("\n" + "Your word is Palindrom");
		} else {
			System.out.println("\n" + "Your word isn't Palindrom");
		}
	}

}
