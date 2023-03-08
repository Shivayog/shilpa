package String;

import java.util.Scanner;

public class Count_character
{
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string");
	String S1=Sc.next();
	int count=0;
	
	for(int i=0;i<S1.length();i++)
	{
	char c=S1.charAt(i);
		 
		if(c==c)
		{
			count++;
		}
		
		
	
}
	System.out.println(count);
	
}
}
