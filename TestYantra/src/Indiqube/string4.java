package Indiqube;

import java.util.Scanner;

public class string4 
{
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string 1");
	String s=Sc.next();
	
	System.out.println("enter the string 2");
	String s1 =Sc.next();
	
	System.out.println(s==s1);
	System.out.println("==============");
	
	System.out.println("enter the string 1");
	String s2=Sc.next();
	System.out.println("enter the string 1");
	String s3=Sc.next();
	System.out.println(s2.equals(s3));
	
	System.out.println("===================");
	
	
	System.out.println("enter the string 1");
	String s4=Sc.next();
	System.out.println("enter the string 1");
	String s5=Sc.next();
	
	System.out.println(s4.compareTo(s5));
	System.out.println("================");
	
	System.out.println("enter the string 1");
	String s6=Sc.next();
	System.out.println("enter the string 2");
	String s7=Sc.next();
	System.out.println("enter the string ");
	String s8=Sc.next();
	
	System.out.println(s6.equalsIgnoreCase(s8));
	
	
}
}
