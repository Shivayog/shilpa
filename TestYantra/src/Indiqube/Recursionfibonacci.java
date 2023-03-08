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
		else
		{
			return fib(n-1)+fib(n-2);
			
		}
	}
	public static void main(String[] args)
	{	
       System.out.println(fib(8));
	}
}
