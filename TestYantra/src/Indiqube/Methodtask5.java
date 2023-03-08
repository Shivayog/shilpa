package Indiqube;

import java.util.Scanner;

public class Methodtask5
{
	public static void grade()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=Sc.nextInt();
	
	
	
		if(n>90)
		{
			System.out.println('A');
		}
		else if(n>80||n<=90)
		{
			System.out.println('B');
		}
		else if(n>=60||n<=80)
		{
			System.out.println('C');
			
		}
		else 
		{
			System.out.println('D');
		}
		System.out.println(n);
	}
	public static void main(String[] args) 
	{
		grade();
	}

}
