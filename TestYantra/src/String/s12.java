package String;

import java.util.Scanner;

public class s12 
{
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=Sc.nextLine();
	int count=0;
	
	for(int i=0;i<s.length();i++)
	{
		char  ch=s.charAt(i);
		if(s.charAt(i)>='A'&& s.charAt(i)<'Z')
			count++;
	}
	System.out.println("upper="+count);
			
	
}
}
