package String;

import java.util.Scanner;

public class String_rev
{
public static void main(String[] args) 
{
	String reverse=" ";
	
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string 1");
	String s=Sc.next();
	System.out.println(s.toUpperCase());
	
	System.out.println("===============");
	
	String s1="knowledge";
	for(int i=s1.length()-1;i>=0;i--)
	{
		reverse=reverse+s1.charAt(i);
	}
	System.out.println(reverse);
	
	System.out.println("===============");

}
}

