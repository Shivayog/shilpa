package Indiqube;

public class Recursionsum 
{
public static void main(String[] args) 
{
	int n=10;
	System.out.println("the sum of natural numbers "+ sum(n));
}

private static int sum(int n)
{
	if(n<=1)
	{
	return n;
	}
	else
	{
		return(n+sum(n-1));
	}
}

}
