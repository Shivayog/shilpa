package Indiqube;

import java.util.Scanner;

public class Recursion2
{
	public static void number(int count)
	{
		if(count<=1)
		{
			return;
		}
		else
		{	
		System.out.println("happy birthday");
		number(count-1);
		}	
	}
	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=Sc.nextInt();
		number(n);
	}

}
