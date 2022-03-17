package Palindrome;

public class armstrongnuber {
	public static void main(String[] args) {
		int num1 = 9, num2 = 0, temp, total = 0;
		num2 = num1;
		while (num2 != 0) {
			temp = num2 % 10;
			total = total + temp * temp * temp;
			num2 /= 10;

		}
		if (total == num1) {
			System.out.println(+num1 + " is armstrong number");
		} else {
			System.out.println(+num1 + " is not armstrong number");
		}
	}
}
