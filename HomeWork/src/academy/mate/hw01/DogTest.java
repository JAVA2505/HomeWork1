package academy.mate.hw01;

import java.util.Arrays;
import java.util.Scanner;

public class DogTest {

	public static void main(String[] args) {

		char[] dog = { '@', ',', ',', ',', ',', ',', ',', ',', ',', ',' };

		System.out.println(Arrays.toString(dog));

		Scanner sc = new Scanner(System.in);
		String controlCase;

		for (;;) {
			controlCase = sc.nextLine();

			switch (controlCase) {

			case "d":

				for (int i = 0; i < dog.length - 1; i++) {
					if (dog[i] == '@') {
						dog[i] = ',';
						dog[i + 1] = '@';
						System.out.println(Arrays.toString(dog));
						break;
					} else if (i == dog.length - 2) {
						System.out.println(Arrays.toString(dog));
						break;
					}
				}
				break;

			case "a":

				for (int i = dog.length - 1; i > 0; i--) {
					if (dog[i] == '@') {
						dog[i] = ',';
						dog[i - 1] = '@';
						System.out.println(Arrays.toString(dog));
						break;
					} else if (i == 1) {
						System.out.println(Arrays.toString(dog));
						break;
					}
				}
				break;

			}
		}
	}

}
