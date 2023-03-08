package Indiqube;

public class Recursion 
{
public static void hello(int count)
{
	if(count<=1)
	{
		return;
	}
	else
	{	
	System.out.println("hi");
	hello(count-1);
	}	
}
public static void main(String[] args)
{
	hello(4);
}
}
