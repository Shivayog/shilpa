package numberprogram;

import java.util.Arrays;

public class ascii_char 
{
public static void main(String[] args) 
{
	String s="good moring";
	char[]c=s.toCharArray();
	int [] a=new int[c.length];
	for(int i=0;i<c.length;i++)
	{
		char c1=c[i];
		int asc=c1;
		a[i]=asc;
	}
	System.out.println(Arrays.toString(a));
}
}
