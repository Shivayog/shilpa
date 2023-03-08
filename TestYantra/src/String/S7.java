package String;

import java.util.Scanner;

public class S7 
{
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=Sc.next();
	String s1=" ";
  s1=s.toUpperCase();
  String temp=" ";
  for(int i=0;i<s.length();i++)
  {
	 if(i%2==0 && s1.charAt(i)==',')
	 {
		 temp+=(char)(s1.charAt(i)+',');
	 }
	 else
	 {
		temp+=s1.charAt(i);
	 }
  }
	 System.out.print(temp);
  }




	
}

