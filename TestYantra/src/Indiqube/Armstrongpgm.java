package Indiqube;

import java.util.Scanner;

public class Armstrongpgm 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	int count=0;
	int temp=num;
	while(num>0)
	{
		
		num=num/10;
		count++;
	}
     temp=num;
     int sum=0;
     while(num>0)
     {
    	 int n=num%10;
    	 int p=1;
	for(int i=1;i<=num;i++)
	{
		sum=sum+p;
		int num1=num/10;
	
		if(temp==sum)
		{
			System.out.println("it is armstrong num");
		}
		else
		{
			System.out.println("it is not a armstrong num");
		}
	}
	}
}	
}
