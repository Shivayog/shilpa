package Indiqube;

public class Recursionfibonacci
{
	public static int fib(int n)
	{
//		System.out.println(fib(6));
	
		if(n<=1)
		{

		return n;
		
		}
//		else
//		{
			return fib(n-1)+fib(n-2);
			
//		}
	}
	public static void main(String[] args)
	{	
		int n=8;
		for(int i=0;i<=n;i++)
       System.out.println(fib(i));
	}
}
