package Indiqube;

import java.util.Scanner;

public class Decp6
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the num");
	int n=sc.nextInt();
	
	for(int r=n;r>=1;r--)
	{
		for(int i=1;i<=n-r;i++)
		{
			System.out.print(" ");
		}
		for(int c=1;c<=r;c++)
		{
			System.out.print("*");
		}
		System.out.println();
}
}
}
