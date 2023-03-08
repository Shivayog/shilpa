package Indiqube;

import java.util.Scanner;

public class Pyramidpattern
{
public static void main(String[] args)
{
	Scanner  sc =new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	
	
	for(int r=1;r<=n;r++)
	{
		for(int j=1;j<=n-r;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=2*r-1;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
}
}
