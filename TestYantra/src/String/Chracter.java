package String;

import java.util.Scanner;
//first and last char

public class Chracter
{
public static void main(String[] args) 
{

	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the stsring");
	String s=Sc.nextLine();
	
	System.out.println(s.charAt(0)+" "+s.charAt(s.length()-1));
}
}
