package arrayclass;

import java.util.Scanner;

public class exception {
	public static void main(String[] args) throws agecheck {
		System.out.println("enter your age :  ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if (a <=0) {
			throw new agecheck();
		} else
			System.out.println("your age :  " + a);
	}
}
