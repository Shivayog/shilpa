package Indiqube;

import java.util.Scanner;

public class Patternspace 
{
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the num");
	int n=Sc.nextInt();
	for(int r=1;r<=n;r++)
	{
		for(int c=1;c<=r;c++)
		{
			if(r+c>n)
			{
		      System.out.print("* ");
		    }
			else
			{
			 System.out.print("  ");
			}
		
		}
		
		System.out.println();
		}		
	}

	}

