package String;

public class countwords 
{
public static void main(String[] args) 
{
	String s="lavanya is a good teacher";
	int count=1;
	for(int i=1;i<s.length();i++)
	{
		char[]ch=s.toCharArray();
	if(s.charAt(i)=='-')
		{
		count++;	
		}
	}
	System.out.println(count);
}
}
