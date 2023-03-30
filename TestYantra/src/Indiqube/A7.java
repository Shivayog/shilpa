package Indiqube;

import java.util.Scanner;
//find the prime number in array

public class A7
{
	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int n=Sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the   array element");
		for(int i=0; i<n; i++)
		{
		a[i]=Sc.nextInt();
		}
//		boolean flag=false;
		for(int i=0;i<n;i++)
		{
			boolean flag=true;
			int b=a[i];
			for(int j=2;j<b;j++)
			{
				if(b%j==0)
				{
					flag=false;
					break;
				}
			}
		
			if(flag==true)
			{
			
					System.out.println(b+"prime number");
			}
				
				
		
		}
		
	}
}
	




		
		
		


