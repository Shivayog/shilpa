package Indiqube;

import java.util.Scanner;

public class Pyramidcharter1
{
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the nunber");
	int n=Sc.nextInt();
	
	for(int r=1;r<=n;r++)
	{
		char ch='a';
		for(int c=1;c<=n-r;c++)
		{
			
			System.out.print("  ");
		}
		for(int k=1;k<=2*r-1;k++)
		{
			
		System.out.print(ch+" ");
		ch++;
		}
		System.out.println();
	}
}
}
