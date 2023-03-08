package String;
//lower and special
import java.util.Scanner;

public class s13
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=Sc.nextLine();
	int count=0;
	int count1=0;
	for(int i=0;i<s.length();i++)
	{
		char  ch=s.charAt(i);
		if(s.charAt(i)>='a'&& s.charAt(i)<'z')
			count++;
		else
		{
			count1++;
		}
	}
	System.out.println("lower ="+count);
	System.out.println("special="+count1);
			
	
}
}
