package Palindrome;

public class Assign1 {
	public static void main(String[]args) {
		int a=3553,b=0,c;
		int d=a;
		while(a != 0)
		{
			c= a % 10;
			b=b*10+c;
			a/=10;
		}
		if(d==b)
		{
			System.out.println("palindrome number");
		}
		else
		{
		System.out.println("not a  palidrome number");
		}
		
	}

}
