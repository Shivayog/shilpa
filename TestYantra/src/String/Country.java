package String;
//country
import java.util.Scanner;

public class Country
{
public static void main(String[] args) 
{
	
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the country name");
	String s=Sc.next();
	int count=0;
	int count1=0;

	for(int i=0;i<s.length();i++)
	{
		
		char c=s.charAt(i);
			 
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
			}
			
		else
		{
			count1++;
		}
	
	}
	System.out.println(" voweles count"+count);
	System.out.println("consonant count"+count1);
	
}
}
