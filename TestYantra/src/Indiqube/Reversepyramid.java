package Indiqube;

import java.util.Scanner;

public class Reversepyramid
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the num");
	int n=sc.nextInt();

	for(int r=n;r>=1;r--)
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
