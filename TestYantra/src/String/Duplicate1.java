package String;

import java.util.Scanner;

public class Duplicate1 
{
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter the name ");
	String s=Sc.nextLine();
	String visited="";
	
	for (int i = 0; i < s.length(); i++) {
		char ch=s.charAt(i);
		if(visited.indexOf(ch)==-1)
		{
		for (int j = i+1; j < s.length(); j++) {
			if(s.charAt(i)==s.charAt(j))
			{
				System.out.println("Duplicate elements : "+s.charAt(i));
				visited+=ch;
				break;
			}
		}
		
		}
	}
	
}

} 

