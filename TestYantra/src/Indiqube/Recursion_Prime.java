package Indiqube;

public class Recursion_Prime
{
	
	public static void main(String[] args) 
	{
		int n=11;
		System.out.println(prime(n,2));
	}
public static boolean prime(int n,int div)
{
	if(n==0||n==1)
	{
		return false;
	}
		if(n==div)
		{
			return true;
			
		}
		if(n%div==0)
		{
			return false;
		}
		return prime(n,div+1);
	
}
}
