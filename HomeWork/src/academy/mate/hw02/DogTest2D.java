package academy.mate.hw02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DogTest2D {

	public static void main(String[] args) {

		char dog = '@';
		char comma = ',';
		char aidBig = 'A';
		char aidSmall = 'a';
		char bombBig = 'B';
		char bombSmall = 'b';

		int dogHealth = 100;
		int positionAidBig;
		int positionAidSmall;
		int positionBombBig;
		int positionBombSmall;

		int line = 0;
		int column = 0;

		int random;

		char[][] dogTest = new char[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

				dogTest[i][j] = comma;
			}
		}

		for (int i = 0; i < 10; i++) {

			if (i == 0) {

				positionAidBig = (int) ((Math.random() * 8) + 1);

				do {
					positionAidSmall = (int) ((Math.random() * 8) + 1);

				} while (positionAidSmall == positionAidBig);

				do {
					positionBombBig = (int) ((Math.random() * 8) + 1);
				} while (positionBombBig == positionAidBig || positionBombBig == positionAidSmall);

				do {
					positionBombSmall = (int) ((Math.random() * 8) + 1);

				} while (positionBombSmall == positionAidBig || positionBombSmall == positionAidSmall
						|| positionBombSmall == positionBombBig);

				random = (int) (Math.random() * 2);
				if (random > 0) {

					dogTest[i][positionAidBig] = aidBig;
				}

				random = (int) (Math.random() * 2);
				if (random > 0) {
					dogTest[i][positionAidSmall] = aidSmall;
				}

				random = (int) (Math.random() * 2);
				if (random > 0) {
					dogTest[i][positionBombBig] = bombBig;
				}

				random = (int) (Math.random() * 2);
				if (random > 0) {
					dogTest[i][positionBombSmall] = bombSmall;
				}

			} else {
				positionAidBig = (int) (Math.random() * 9);
				do {
					positionAidSmall = (int) (Math.random() * 9);
				} while (positionAidSmall == positionAidBig);

				do {
					positionBombBig = (int) (Math.random() * 9);
				} while (positionBombBig == positionAidBig || positionBombBig == positionAidSmall);

				do {
					positionBombSmall = (int) (Math.random() * 9);
				} while (positionBombSmall == positionAidBig || positionBombSmall == positionAidSmall
						|| positionBombSmall == positionBombBig);

				random = (int) (Math.random() * 2);
				if (random > 0) {

					dogTest[i][positionAidBig] = aidBig;
				}

				random = (int) (Math.random() * 2);
				if (random > 0) {
					dogTest[i][positionAidSmall] = aidSmall;
				}

				random = (int) (Math.random() * 2);
				if (random > 0) {
					dogTest[i][positionBombBig] = bombBig;
				}

				random = (int) (Math.random() * 2);
				if (random > 0) {
					dogTest[i][positionBombSmall] = bombSmall;
				}

			}

		}

		dogTest[0][0] = dog;

		for (int i = 0; i < 10; i++) {
			System.out.println(Arrays.toString(dogTest[i]));

		}
		System.out.println("Health: " + dogHealth);

		Scanner sc = new Scanner(System.in);
		String controlCase;

		for (;;) {

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {

					if (dogTest[i][j] == dog) {
						line = i;
						column = j;

					}
				}
			}

			controlCase = sc.nextLine();

			switch (controlCase) {

			case "d":

				if (column < 9) {
					
					if (dogTest[line][column + 1] == aidBig) {
						dogHealth = dogHealth + 40;
						if (dogHealth > 100) {
							dogHealth = 100;
						}
					} else if (dogTest[line][column + 1] == aidSmall) {
						dogHealth = dogHealth + 20;
						if (dogHealth > 100) {
							dogHealth = 100;
						}
					} else if (dogTest[line][column + 1] == bombBig) {
						dogHealth = dogHealth - 40;
						if (dogHealth <= 0) {
							sc.close();
							System.out.println("GAME OVER");
						}
					} else if (dogTest[line][column + 1] == bombSmall) {
						dogHealth = dogHealth - 20;
						if (dogHealth <= 0) {
							sc.close();
							System.out.println("GAME OVER");
						}
					}
						
					dogTest[line][column + 1] = dog;
					dogTest[line][column] = comma;
				}

				break;

			case "a":

				if (column > 0) {
					
					if (dogTest[line][column - 1] == aidBig) {
						dogHealth = dogHealth + 40;
						if (dogHealth > 100) {
							dogHealth = 100;
						}
					} else if (dogTest[line][column - 1] == aidSmall) {
						dogHealth = dogHealth + 20;
						if (dogHealth > 100) {
							dogHealth = 100;
						}
					} else if (dogTest[line][column - 1] == bombBig) {
						dogHealth = dogHealth - 40;
						if (dogHealth <= 0) {
							sc.close();
							System.out.println("GAME OVER");
						}
					} else if (dogTest[line][column - 1] == bombSmall) {
						dogHealth = dogHealth - 20;
						if (dogHealth <= 0) {
							sc.close();
							System.out.println("GAME OVER");
						}
					}
					
					dogTest[line][column - 1] = dog;
					dogTest[line][column] = comma;
				}
				break;

			case "s":

				if (line < 9) {

					if (dogTest[line + 1][column] == aidBig) {
						dogHealth = dogHealth + 40;
						if (dogHealth > 100) {
							dogHealth = 100;
						}
					} else if (dogTest[line + 1][column] == aidSmall) {
						dogHealth = dogHealth + 20;
						if (dogHealth > 100) {
							dogHealth = 100;
						}
					} else if (dogTest[line + 1][column] == bombBig) {
						dogHealth = dogHealth - 40;
						if (dogHealth <= 0) {
							sc.close();
							System.out.println("GAME OVER");
						}
					} else if (dogTest[line + 1][column] == bombSmall) {
						dogHealth = dogHealth - 20;
						if (dogHealth <= 0) {
							sc.close();
							System.out.println("GAME OVER");
						}
					}
					
					dogTest[line + 1][column] = dog;
					dogTest[line][column] = comma;

				}
				break;

			case "w":

				if (line > 0) {
					
					if (dogTest[line - 1][column] == aidBig) {
						dogHealth = dogHealth + 40;
						if (dogHealth > 100) {
							dogHealth = 100;
						}
					} else if (dogTest[line - 1][column] == aidSmall) {
						dogHealth = dogHealth + 20;
						if (dogHealth > 100) {
							dogHealth = 100;
						}
					} else if (dogTest[line - 1][column] == bombBig) {
						dogHealth = dogHealth - 40;
						if (dogHealth <= 0) {
							sc.close();
							System.out.println("GAME OVER");
						}
					} else if (dogTest[line - 1][column] == bombSmall) {
						dogHealth = dogHealth - 20;
						if (dogHealth <= 0) {
							sc.close();
							System.out.println("GAME OVER" + sc);
						}
					}

					dogTest[line - 1][column] = dog;
					dogTest[line][column] = comma;
				}
				break;

			}

			for (int i = 0; i < 10; i++) {

				System.out.println(Arrays.toString(dogTest[i]));

			}
			dogHealth = dogHealth - 5;
			System.out.println("Health: " + dogHealth);

		}

	}

}
