package Indiqube;

import java.util.Scanner;

public class Happynumber 
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the num");
	int n=Sc.nextInt();
	int sum=0;
	while(n>9)
	{
		while(n!=0)
		{
      	int d =n%10;
      	sum=sum+d*d;
     	n=n/10;
		}
	n=sum;
	sum=0;
		}

	if(n==1)
	{
		System.out.println("it is happy num");
	
	}
	else 
	{
		System.out.println("it is  sad num ");
	
	}
    }

}



