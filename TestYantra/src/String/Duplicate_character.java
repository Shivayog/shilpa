package String;

import java.util.Scanner;

public class Duplicate_character
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=Sc.next();
	char[]ch=s.toCharArray();
	for(int i=0;i<s.length();i++)
	{
		for(int j=i+1;j<s.length();j++)
		{
			if(ch[i]==ch[j])
			{
				System.out.println(ch[j]);
				break;
			}
		}
	}
	
	
}
}
