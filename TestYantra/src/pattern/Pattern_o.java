package pattern;

import java.util.Scanner;

public class Pattern_o
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the num");
	int n=Sc.nextInt();
	for(int j=1;j<=n;j++)
	{
		for(int i=1;i<=n;i++)
		{
			if(j==i||j+i==n+1)
			{
				System.out.print("  ");
			}
			else
			{
				System.out.print("* ");
			}
			
		}
		System.out.println();
	}
}
}
