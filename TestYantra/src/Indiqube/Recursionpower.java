package Indiqube;

import java.util.Scanner;

public class Recursionpower 
{
public static void main(String[] args)
{
Scanner Sc=new Scanner(System.in);
System.out.println("enter the base");
int n=Sc.nextInt();
System.out.println("enter the power");
int p=Sc.nextInt();
System.out.println(power(p,n));
}
public static int power(int p,int n)
{ 
if(p==0)
{
	return 1;
}
else
{
	return n*power(p-1, n);
}
}
}
