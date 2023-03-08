package Indiqube;

import java.util.Scanner;

public class Recursionsumnumber 
{
public static void main(String[] args)
{
	Scanner Sc=Sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=Sc.nextInt();
	System.out.println("the sum of natural number is  " +  sum(n));
}

private static int sum(int n)
{
	

	if(n<=1)
	{
	return n;
	}
	else
	{
		return(n+sum(n-1));
	}
	
}
	
}

