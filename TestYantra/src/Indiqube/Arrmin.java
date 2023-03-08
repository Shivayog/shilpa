package Indiqube;

import java.util.Scanner;

public class Arrmin 
{
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the num");
		int n=Sc.nextInt();
		System.out.println("enter array elements");
		int []a=new int [n];
		int max=a[0];
		int min=a[0];
		for(int i=0;i<=a.length;i++)
		{
			a[i]=Sc.nextInt();
		}
			System.out.println("enter the element");
			int n2=Sc.nextInt();
			for(int i=0;i<n;i++)
			{
			if(a[i]<min) min=a[i];
			else if(a[i]>max) max=a[i];
		     }
		System.out.println(min);
		System.out.println(max);
		
	}

}
