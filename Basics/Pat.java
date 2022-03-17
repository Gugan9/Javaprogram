package pattern10;
import java.util.Scanner;
public class Pat {
	public static void main(String[]args) {
		int a,b;
		Scanner scanner=new Scanner(System.in);
		int c=scanner.nextInt();
		for(a=1;a<=c;a++)
		{
		for(b=1;b<=a;b++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
	}

}
