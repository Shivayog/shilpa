package Indiqube;

import java.util.Scanner;

public class Linear1
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the size ");
	int n=Sc.nextInt();
	int []a=new int[n];
	System.out.println("enter"+n+" the value");
	for(int i=0;i<n;i++)
	{
		a[i]=Sc.nextInt();
	
		System.out.println("enter the element");
		int ele=Sc.nextInt();
		int p=-1;
		for( i=0;i<a.length;i++)
		{	
			if(a[i]==ele)
			{
				p=i;
	
			break;
			}
			
		}
		if(p!=-1)
		{
			System.out.println(ele+" found"+(p+1));
		}
		else
		{
			System.out.println(ele+"not found");
		}
		
	}
	
}
}
