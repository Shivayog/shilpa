package String;

//import java.util.Scanner;

public class Reverse
{
public static void main(String[] arg)
{
//Scanner Sc=new Scanner(System.in);
//System.out.println("enter the string");
//String s=Sc.next();
	String s="happy";
String rev=" ";
for(int i=s.length()-1;i>=0;i--)
{
	rev=rev+s.charAt(i);
	
}
System.out.println(rev);
}
}
