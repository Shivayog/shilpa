package String;

import java.util.Arrays;

public class Anagram2
{
public static void main(String[] args) 
{
	
	String s1="Silent";
	String s2="Listen";
	
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	
	char[] c1=s1.toCharArray();
	char[] c2=s2.toCharArray();
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	for(int i=0;i<c1.length;i++)
	{
		
		if(c1[i]==c2[i])
		{
		break;
		}
	}
	
		System.out.println("anagram");
	
		
	
}
}
