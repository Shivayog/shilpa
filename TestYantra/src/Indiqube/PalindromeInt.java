package Indiqube;

import java.util.Scanner;

public class PalindromeInt 
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the size");
	int n=Sc.nextInt();
	System.out.println("enter the arry elements");
	int a[]=new int[n];
	
	for(int i=0;i<n;i++)
	{
		a[i]=Sc.nextInt();
		
	}
	for(int i=0;i<n;i++)
	{
	boolean flag=false;
	
	
	for(int j=0;j<n;j++)
	{
		int a1=a[j];
		int a2=a1;
		int rev=0;
	
		while(a1>0)
		{
		int d=a1%10;
		rev=rev*10+d;
		a1=a1/10;
		}
		if(a2==rev)
		{
			flag=true;
			System.out.println("palindrome "+a2);
		}
	}
	if(flag==false)
	{
		System.out.println("not a palindrome");
	}
	}
	
}
}
	

	