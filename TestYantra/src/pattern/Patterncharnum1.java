package pattern;

import java.util.Scanner;

public class Patterncharnum1
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the num");
	int n=Sc.nextInt();
	char ch='A';
	for(int j=1;j<=n;j++)
	
	{
		for(int i=1;i<=n;i++)
		{
			if(j==i)
			{
				System.out.print(ch+" ");
				ch++;
			}
			else 
			{
				System.out.print(j+i+" ");
			}
			
			
		}
		System.out.println();
	}
	
}
}
