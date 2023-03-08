package String;
//Print 1st and last char
import java.util.Scanner;

public class String3 
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string");
	String c=Sc.next();
	System.out.println(c.charAt(0)+" "+c.charAt(c.length()-1));
}
}
