package String;

import java.util.Scanner;

public class string_methods 
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=Sc.nextLine();
	
	System.out.println(s.toUpperCase());
	
	System.out.println("enter the string");
	String s1=Sc.nextLine();
	System.out.println(s1.toLowerCase());
	
	
	
	System.out.println("enter the string");
	String s3=Sc.nextLine();
	System.out.println(s3.length());
	
	
	System.out.println("enter the string 1");
	String s4=Sc.nextLine();
	System.out.println("enter the string 2");
	String s5=Sc.nextLine();
	System.out.println("enter the string 3");
	String s6=Sc.nextLine();
	System.out.println(s4.equals(s5));
	 System.out.println(s4.equals(s6));
	
	 System.out.println("==========");
	 System.out.println(s4.equalsIgnoreCase(s6));
	 
	 System.out.println("enter the string 1");
		String s7=Sc.nextLine();
		System.out.println("enter the string 2");
		String s8=Sc.nextLine();
		
		System.out.println(s7.concat(s8));
		System.out.println("===========");
	 
	
	
	
	
	
	
	
}
}
