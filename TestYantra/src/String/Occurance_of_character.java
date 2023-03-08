package String;

import java.util.Arrays;

public class Occurance_of_character 
{
public static void main(String[] args)
{
	String s="aaaaabaccaaa";
	char[]c=s.toCharArray();
    char	target ='a';
    int count=0;
    for(int i=0;i<s.length();i++)
    {
    	if(c[i]==target)
    		count++;
    }
    System.out.println("occurance of "+"target "+ count);
}
}
