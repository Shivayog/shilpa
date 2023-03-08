package String;

import java.util.Scanner;
//enter the numberand first 4 should be number remaining are astrix

public class mobile_Number 
{
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the mobile number");
	String s=Sc.next();
	System.out.println(s.substring(0,4).concat("######"));
	
	System.out.println("===========");
	System.out.print(s.substring(0,4));
	System.out.print(("######"));
	System.out.println();
	
	System.out.println("==================");
	
	System.out.println(s.substring(0,4)+"######");
	
	
}
}
