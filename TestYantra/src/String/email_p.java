package String;

import java.util.Scanner;

public class email_p 
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=Sc.next();
	

	
	if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
	{
		if(s.endsWith(".com") || s.endsWith(".in"))
				{
					if(s.contains("@"))
					{
						System.out.println("Valid email id");
					}
				}
	}
	else
	{
		System.out.println("Enter a valid email id");
	}
}
}
			