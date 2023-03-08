package String;
//print  the position of  given letter 

import java.util.Scanner;

public class s4 
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=Sc.next();
	for(int i=0;i<s.length();i++)
	{
	char c=s.charAt(i);
	if(s.charAt(i)=='a')
	{
		System.out.print(i);
	}
	
	}
}
}
