package String;

import java.util.Scanner;

public class Replace 
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=Sc.next();
	System.out.println("enter the replace string");
	String s1=Sc.next();
	System.out.println("enter the replacing string");
	String s2=Sc.next();
	System.out.println(s.replace(s1, s2));
	
	System.out.println("=============");
	String x="gajani";
	{
	System.out.println( x.replace('g', 'r'));
	}
}
	
	
	
}


