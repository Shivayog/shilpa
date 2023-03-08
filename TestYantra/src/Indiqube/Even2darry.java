package Indiqube;

import java.util.Scanner;

public class Even2darry 
{
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);
	boolean flag=false;
	
	System.out.println("enter the row array  elements");
	int r=Sc.nextInt();
	System.out.println("enter the array  col elements");
	int c=Sc.nextInt();
	int[][]a=new int[r][c];
	System.out.println("enter the elements");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
		a[i][j]=Sc.nextInt();
		}
	}
	
	int evencount=0;
	int oddcount=0;
	for(int i=0;i<r;i++)
	{
	for(int j=0;j<c;j++)
	{
		if(a[i][j]%2==0)
		{
			evencount++;
		}
		else
		{
			oddcount++;
		}
	}
	}
	System.out.println();

	System.out.println(evencount +" elements even");

    System.out.println(oddcount +" elements odd");
}
}
	
			
		
			   
