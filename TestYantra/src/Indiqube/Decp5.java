package Indiqube;

import java.util.Scanner;

public class Decp5
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the num");
	int n=sc.nextInt();
	
	for(int r=1;r<=n;r++)
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
	