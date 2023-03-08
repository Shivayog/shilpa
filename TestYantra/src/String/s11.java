package String;

import java.util.Scanner;

public class s11 
{
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=Sc.nextLine();
	int count=0;
	for(int i=0;i<s.length();i++)
	{
	char c=s.charAt(i);
		 
		if(c==' ')
		{
			count++;
		}
		
		
	
}
	System.out.println(count);
}
}
