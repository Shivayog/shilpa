package Indiqube;

public class Recursioneven
{
public static void main(String[] args)
{
	int n=7;
	even(n);
}
public static int even(int n)
{
	if(n<=1)
	{
		return n;
	}
	else
	{
		if(n%2==0)
		{
			System.out.println("the number is even");
		}
		else
		{
			System.out.println("the number is odd");
		}
		return(n-1);
	}
		
	
}
}
