package Indiqube;

public class Recursion1
{
public static void hello(int count)
{
	if(count<=1)
	{
		return;
	}
	else
	{	
	System.out.println("welcome  to testyantra");
	hello(count-1);
	}	
}
public static void main(String[] args)
{
	hello(6);
}
}
