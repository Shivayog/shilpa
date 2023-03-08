package String;

import java.util.Scanner;

public class Ascii_even 
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string");
	String S=Sc.next();
	int count=0;
	for(int i=0;i<S.length();i++)
	{
		int n= S.charAt(i);
		
		if(n%2==0);
		count++;
		
	}
	System.out.println(count);
}
}
