package Indiqube;

import java.util.Scanner;

public class Arrayeven1 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size");
	int n=sc.nextInt();
	int[] a=new int [n];
	for(int i=0; i<n; i++)
	{
	a[i]=sc.nextInt();
	}
	for(int i=0; i<n; i++)
	{
	if(a[i]%2==0)
	{
	System.out.println(a[i]+ "Even number");
	}
	else
	{
	System.out.println(a[i]+"Odd Number");
	}
	
	}
	}

	
}

