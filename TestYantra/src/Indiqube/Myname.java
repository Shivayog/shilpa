package Indiqube;

//import java.util.Scanner;

public class Myname
{
public static void main(String[] args) 
{
//	Scanner Sc=new Scanner(System.in);
//	System.out.println("enter the number");
//	int n=Sc.nextInt();
	for(int r=1;r<=5;r++)
	{
		for(int c=1;c<=5;c++)
		{
			if(r==1||r==3||r==5||(r==2&&c==1||r==4&&c==5))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
}
}
