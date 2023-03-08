package String;

import java.util.Scanner;
//LOWER
public class s14
{
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string ");
	String s1=Sc.next();
	String s2=" ";

	for(int i=0;i<s1.length();i++)
	{
		if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
		{
			s2+=(char)(s1.charAt(i)+32);
		}
		else
		{
			s2+=s1.charAt(i);
		}
	}
	System.out.println(s2);
}
}
