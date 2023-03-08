package Indiqube;

import java.util.Scanner;

public class Methodtask3
{
public static void greatest()
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=Sc.nextInt();
	System.out.println("enter the number");
	int b=Sc.nextInt();
	System.out.println("enter the number");
	int c=Sc.nextInt();
	
	 int great =(a>b)?(a>c?a:c):(b<c?b:c);
	{
	System.out.println(great+" ");
	}
	
	
}
public static void main(String[] args)
{
	greatest();
}
}
