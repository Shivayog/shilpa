package String;

import java.util.Scanner;

public class letterseperatedbycomm
{
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=Sc.next();
	for(int i=0;i<s.length();i++)
	{
		if(i==s.length()-1)
		{
			System.out.println(s.charAt(i));
		}
		else
		{
			System.out.print(s.charAt(i)+",");
		}
	}
	
}
}
