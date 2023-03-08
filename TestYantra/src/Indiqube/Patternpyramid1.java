package Indiqube;

import java.util.Scanner;

public class Patternpyramid1 
{
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the num");
	int n=Sc.nextInt();
	for(int j=1;j<=n;j++)
	{
		for(int i=1;i<=j;i++)
		{
			if(j+i<=n)
			{
				System.out.print("");
			}
			else
			{
				{
					for(int k=1;k<=2*n;k--)
				
				System.out.print("*");
				}
			}
			
		}
		System.out.println();
	}
}
}
