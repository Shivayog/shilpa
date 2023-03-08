package String;
//check the string trur or false
import java.util.Scanner;

public class S5 
{
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the firsr string");
	String s=Sc.next();
	
	System.out.println("enter the second string");
	String s1=Sc.next();
	
	
	if(s.equals(s1)) 
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
	}
}

