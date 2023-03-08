package Indiqube;

import java.util.Scanner;

public class Array2
{
	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
//          System.out.println("Enter the nums");
//          int n1=Sc.nextInt();
//          int n2=Sc.nextInt();
//          int n=Sc.nextInt();
//          int n1=Sc.nextInt();
		int a[]=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		int p=1;
//		for( int i=0;i<a.length;i++)
//		{
//			a[i]=Sc.nextInt();
//		}
		for(int i=0;i<a.length;i++)
		{
			p=p*a[i];
		   
		}
		 System.out.println(p);
		  
		
	}

}
