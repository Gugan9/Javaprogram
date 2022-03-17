package Palindrome;

public class Fibnocci {
	public static void main(String[]args)
	{
		int i=1,n=9,firstnum=0,secondnum=1;
		System.out.println("Fibocii series "+ n);
	
	while(i<=n) {
		System.out.print(firstnum+",");
		int nextnum=firstnum+secondnum;
		firstnum=secondnum;
		secondnum=nextnum;
		i++;
	}

}}
