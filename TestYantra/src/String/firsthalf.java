package String;
//capital letter and Small
import java.util.Scanner;

public class firsthalf 
{
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=Sc.next();
	System.out.print(s.substring(0,s.length()/2 ).toUpperCase());
	System.out.print(s.substring(s.length()/2,s.length()).toLowerCase());
	{
		
	}
}
}
