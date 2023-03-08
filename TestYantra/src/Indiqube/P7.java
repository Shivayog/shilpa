package Indiqube;
import java.util.Scanner;
public class P7 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	for(int r=n;r>=1;r--)
	{
		for(int c=n;c>=r;c--)
		{
			System.out.print(c);
			
			}
		
		System.out.println();
		
}
}
}
