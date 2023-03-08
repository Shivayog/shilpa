package String;
//index odd  and even
import java.util.Scanner;
public class Person 
{
public static void main(String[] args) 
{

	Scanner Sc= new Scanner(System.in);
	System.out.println("enter the name");
    String s=Sc.nextLine();
  String s1=" ";
  s1=s.toUpperCase();
  String temp=" ";
  for(int i=0;i<s.length();i++)
  {
	 if(i%2!=0 && s1.charAt(i)!=' ')
	 {
		 temp+=(char)(s1.charAt(i)+32);
	 }
	 else
	 {
		temp+=s1.charAt(i);
	 }
  }
	 System.out.print(temp);
  }
}







