package Indiqube;

import java.util.Scanner;

public class Recursionpower 
{
public static void main(String[] args)
{
Scanner Sc=new Scanner(System.in);
System.out.println("enter the base");
int b=Sc.nextInt();
System.out.println("enter the power");
int p=Sc.nextInt();
System.out.println(power(p,b));
}
public static int power(int p,int b)
{ 
if(p==0)
{
	return 1;
}
else
{
	return b*power(p-1, b);
}
}
}
