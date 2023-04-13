package String;

import java.util.Scanner;

public class String_concat 
{
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the string 1");
		String s1=Sc.next();
		
		System.out.println("enter the string 2");
		String S2=Sc.next();
		
		System.out.println(s1.concat(S2));
		
		
		String s3="test yantra";
		System.out.println(s3.toCharArray());

		
	}
	

}
