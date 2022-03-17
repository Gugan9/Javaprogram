package Palindrome;

public class Primenum {
	public static void main(String[] args)
	{
		int n=99,i=2;
		boolean flag=false;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
			i++;
		}
		if(!flag)
		{
		System.out.println("prime number");
		}
		else
		{
		System.out.println("not a prime number");
		}
	}

}
