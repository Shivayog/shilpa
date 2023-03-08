package Indiqube;

import java.util.Scanner;

public class Identitymatrix 
{
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);
	boolean flag=true;
	System.out.println("enter the row");
	int r=Sc.nextInt();
	System.out.println("enter the col");
	int c=Sc.nextInt();
	int a[][]=new int[r][c];
	System.out.println("enter the elements");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			a[i][j]=Sc.nextInt();
		}
	}
	for(int i=0;i<r;i++) 
	{
		for(int j=0;j<c;c++)
		{
			if(i==j&&a[i][j]!=1)
			{
				flag=false;
				break;
			}
			
			
		}
	}
		if(flag==true)
		{
		System.out.print("identity");
		}
		else
		{
			System.out.print("not identity");
		}
	
}
}

