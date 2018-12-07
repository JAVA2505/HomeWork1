package academy.mate.hw01;

import java.util.Arrays;

public class MonthsTest {

	public static void main(String[] args) {

		int[] months = new int[12];

		for (int i = 0; i < months.length; i++) {
			months[i] = i < 7 && i % 2 == 0 || i >= 7 && i % 2 == 1 ? 31 : (i == 1 ? 28 : 30);
		}

		System.out.println(Arrays.toString(months));
	}

}