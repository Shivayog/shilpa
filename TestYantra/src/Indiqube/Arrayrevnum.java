package Indiqube;

import java.util.Scanner;

public class Arrayrevnum
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the  size of elements");
	int size=Sc.nextInt();
	int []a=new int[size];

	System.out.println("enter the elements");
	for(int i=0;i<a.length;i++)
	{
		a[i]=Sc.nextInt();		
	}
	
	for(int i=0;i<a.length-1;i++)
	{int n=a[i];
		int temp =n;
		int rev=0;
		while(n>0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		
		if(temp==rev)
		
			System.out.println(temp+" palindrome ");
		}
	}
	

}
