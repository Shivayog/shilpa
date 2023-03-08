package String;

import java.util.Arrays;
import java.util.Scanner;

public class email1
{
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=Sc.next();
   if(s.contains(" null"))
    {
	    if(s.contains("@"))
	    {	
		String[]s1=s.split("@");
		String user=s1[0];
		String domain=s1[1];

	   if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
	    {
		if(s.endsWith(".com") || s.endsWith(".in"))
				{
			System.out.println("valid email");
				}
		
		  if(domain.contains(".")||domain.startsWith("!.")||domain.endsWith("."))
		{
			System.out.println("valid email");
		}
		
		  else {
		
			System.out.println("enter the vaild id");
		}
		
		if(domain.contains(".."))
		{
			System.out.println("valid email");
		}
       else
		{
			System.out.println("enter the valid email id");
		} 
	
	
	for(int i=0;i<s1.length;i++)
	System.out.println(s1[i]);
	}
	}
}

}
}








