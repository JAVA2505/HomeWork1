package academy.mate.hw02;

import java.util.Scanner;

public class NameTest {

	public static void main(String[] args) {

		String fioInput;
		String fioOutput;
		int symbolInt;

		System.out.print("Enter your FIO (ENG): ");

		Scanner sc = new Scanner(System.in);

		fioInput = sc.nextLine();

		sc.close();

		System.out.println("\n");

		char[] fioArray = fioInput.toCharArray();

		for (int i = 0; i < fioArray.length; i++) {
			if (i == 0) {
				symbolInt = fioArray[i] - 32;
				fioArray[i] = (char) symbolInt;
			} else if (fioArray[i] == '.') {
				symbolInt = fioArray[i - 1] - 32;
				fioArray[i - 1] = (char) symbolInt;
			}
		}

		fioOutput = String.valueOf(fioArray);
		System.out.println("Your FIO is: " + fioOutput);

	}

}
