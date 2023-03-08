package Indiqube;

import java.util.Scanner;

public class Xylemandpholem
{
public static void main(String[] args)

{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=Sc.nextInt();
int sum=0;
	int sumoflast=0;
	int sumofrest=0;
	while(n>9)
	{
		sum=sumoflast+n%10;
		n=n/10;
		
	}
	sumoflast=n;
		if(sumoflast==sumofrest)
		{
			System.out.println("it is xylem");
		}
			else
			{
				System.out.println("it is pholem");
			}
		}
	

}


