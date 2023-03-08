package String;

import java.util.Scanner;

public class s10 
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=Sc.next();
	String s1="";
	for(int i=0;i<s.length();i++)
	{
		s1=s1+s;
		s1=s1+" ";
	}
	System.out.println(s1);
	
}
}
