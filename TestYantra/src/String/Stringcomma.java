package String;

import java.util.Scanner;

public class Stringcomma 
{
public static void main(String[] args)
{
	Scanner  Sc= new Scanner(System.in);
	System.out.println();
	String s=Sc.next();
	char[]ch=s.toCharArray();
	for(int i=0;i<s.length();i++)
	{
		if(i%2==0)
		{
			System.out.print(i+",");
		}
	}
	
}
}
