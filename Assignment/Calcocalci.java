package project99;

import java.util.Scanner;

public class Calcocalci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("enter 1 for addition");
			System.out.println("enter 2 for subraction");
			System.out.println("enter 3 for mutiliplication");
			System.out.println("enter 4 for division");
			System.out.println("enter 5 for exit");
			int z = scanner.nextInt();
			if (z == 1 || z == 2 || z == 3 || z == 4) {
				System.out.println("enter first number :");
				int a = scanner.nextInt();
				System.out.println("enter second number : ");
				int b = scanner.nextInt();

				switch (z) {
				case 1: {
					int c = Calo.add(a, b);
					System.out.println("RESULT =  " + c);
					break;
				}
				case 2: {

					int c = Calo.sub(a, b);
					System.out.println("RESULT =  " + c);
					break;
				}
				case 3: {

					int c = Calo.mul(a, b);
					System.out.println("RESULT =  " + c);
					break;
				}
				case 4: {

					int c = Calo.div(a, b);
					System.out.println("RESULT =  " + c);
					break;
				}

				}

			} else if (z == 5) {
				break;
			} else {
				System.out.println("not valid");
			}
		} while (true);
		scanner.close();
	}
}
                                                             