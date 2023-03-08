package String;

import java.util.Scanner;

public class Task1 
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=Sc.next();
	String s1=" ";
	for(int i=s.length()-1;i>=0;i--)
	{
		s1=s1+s.charAt(i);
	}
	System.out.println(s1);
}
}
