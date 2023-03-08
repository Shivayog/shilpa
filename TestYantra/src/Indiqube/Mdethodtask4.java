package Indiqube;

import java.util.Scanner;

public class Mdethodtask4
{
public static void average()
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the number");
	int m1=Sc.nextInt();
	System.out.println("enter the number");
	int m2=Sc.nextInt();
	System.out.println("enter the number");
	int m3=Sc.nextInt();
	System.out.println("enter the number");
	int m4=Sc.nextInt();
	System.out.println("enter the number");
	int m5=Sc.nextInt();
	int avg=((m1+m2+m3+m4+m5)/5);
	double per=(m1+m2+m3+m4+m5/500)*(100);
	
	System.out.println(avg);
	System.out.println(per);
	
	
}
public static void main(String[] args)
{
	average();
}
}
