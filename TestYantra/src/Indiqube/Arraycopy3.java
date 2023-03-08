package Indiqube;

import java.util.Scanner;

public class Arraycopy3 
{
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);

	System.out.println("enter the values");
	int n=Sc.nextInt();
	System.out.println("enter array elements");
	int []a=new int [n];
	boolean flag=true;
	for(int i=0;i<n;i++)
	{
		a[i]=Sc.nextInt();
	}
	System.out.println("enter the element");
	int n2=Sc.nextInt();
	for(int i=0;i<n;i++)
	{
		if(n2==a[i])
		{
			flag=false;
			break;
		}
		if(flag==true)
		{

			System.out.println("element is   present");
		}
		else
		{
			System.out.println("element is not present");
		}
		}
	}
}

