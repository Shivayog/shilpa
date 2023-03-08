package Indiqube;


//import java.util.Scanner;

public class Booleanprime
{
	public static boolean Prime(int n)
	{
	if(n<=1)
	{
		return false;
	}
		
		boolean flag=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
	System.out.println(Prime(5));
	}

}
