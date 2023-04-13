package String;

import java.util.Scanner;

public class String_upper_lower_index
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=Sc.nextLine();
	System.out.println(s.toUpperCase());
	
	
	String s1="java";
	System.out.println(s1.toUpperCase());
	
	System.out.println("*************");
	
	
	System.out.println(s1.toLowerCase());
	
	System.out.println("===============");
	
	
	System.out.println("enter the string");
	String s2=Sc.nextLine();
	System.out.println(s2.toLowerCase());
	
	String s3="TEST YANTRA";
	System.out.println(s3.toLowerCase());
	
	System.out.println("enter the string");
	String s4=Sc.nextLine();
	System.out.println(s4.indexOf('i'));
	
	System.out.println("======================");

	
	String s5="Test Program";
	System.out.println(s5.indexOf(5));
	System.out.println("============");
	
	
	System.out.println("enter the string");
	String s6=Sc.nextLine();
	System.out.println(s6.length());
	
	String s7="    Program";
	System.out.println(s7.length());
	
	System.out.println("************");
	
	

	System.out.println("enter the string");
	String s8=Sc.nextLine();
	System.out.println(s8.substring(1 ,8));
	
	
	System.out.println("enter the string 1");
	String s9=Sc.nextLine();
	System.out.println("enter the string 2");
	String s10=Sc.nextLine();
	
	System.out.println(s9.compareTo(s10));
	System.out.println("=========");
	
	System.out.println("enter the string 1");
	String s11=Sc.nextLine();
	System.out.println("enter the string 2");
	String s12=Sc.nextLine();
	System.out.println("enter the string 3");
	String s13=Sc.nextLine();
	System.out.println(s11.equals(s12));
	 System.out.println(s11.equals(s13));
	
	 System.out.println("==========");
	 System.out.println(s11.equalsIgnoreCase(s12));
	 
	 
	 
	 System.out.println("enter the string 1");
		String s14=Sc.nextLine();
		System.out.println("enter the string 2");
		String s15=Sc.nextLine();
		
		System.out.println(s14.concat(s15));
		System.out.println("===========");
		
		String s16="Banglore";
		System.out.println(s16.contains("gal"));
		System.out.println("=================");
		
		 String s17="Java Programs";
	        System.out.println(s17.endsWith("Programs"));
	        
	        System.out.println("==========");
	        
	        String s18="Harison";
	        System.out.println(s18.isEmpty());
	        
	        System.out.println("enter the string ");
			String s19=Sc.nextLine();
			System.out.println(s19.toCharArray());
		
		
		
	
	
	
	
	
	
}
}
