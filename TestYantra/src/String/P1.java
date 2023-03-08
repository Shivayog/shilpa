package String;

import java.util.Scanner;
//enter the city name and displiay last 4 charcter

public class P1 
{
public static void main(String[] args) 
{ 
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the city name");
	String s=Sc.next();
	System.out.println(s.substring(s.length()-4));
}
}
