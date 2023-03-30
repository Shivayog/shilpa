package String;

import java.util.Arrays;
public class Split1
{
public static void main(String[] args) 
{
	String s="hello everyone good morning";
	String[]s1=s.split(s);
	
	 System.out.println(Arrays.toString(s1));
     for(int i=0;i<s1.length;i++)
     {
   	  System.out.println(s1[i]);
     }
	
}
}
