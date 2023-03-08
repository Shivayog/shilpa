package Indiqube;

import java.util.Scanner;

public class Patterncount
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the nunber");
	int n=Sc.nextInt();
	for(int r=1;r<=n;r++)
	{
		int c1=1;
	
		for(int c=1;c<=n-r;c++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=2*r-1;k++)
		{
			if(k<r)
			{
			
				System.out.print(c1);
			c1++;
			}
			
		
			else {
			
				System.out.print(c1);
			c1--;
			}
		}
		System.out.println();
	}
}
}
