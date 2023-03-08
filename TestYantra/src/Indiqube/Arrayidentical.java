package Indiqube;

import java.util.Scanner;

public class Arrayidentical 
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	int[]a=new int[3];
	int[]b=new int[3];
//	boolean flag=false;
	System.out.println("enter the array first elements");
	for(int i=0;i<a.length;i++)
	{
		a[i]=Sc.nextInt();
	}
	System.out.println("enter the array second elements");
	for(int i=0;i<b.length;i++)
	{
		b[i]=Sc.nextInt();
	}
	int i=0;
	boolean flag=true;
	if(a[i]==b[i])
	{
		flag=false;
	}
	if(flag==true)
	{
		System.out.println("identical");
	}
	else
	{
		System.out.println(" not identical");
	}
}
}
