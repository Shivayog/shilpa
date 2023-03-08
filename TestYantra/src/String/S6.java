package String;

import java.util.Scanner;

public class S6 
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("enter the string");
	String s=Sc.next();
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
		if(rev.equals(s))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
} 
}
