package Indiqube;

public class Voidfibonacci
{
public static void fibonacci(int n)
{
	int a=1;
	int b=1;
	int c;
	for(int i=1;i<=n;i++)
	{
		System.out.println(a+"  ");
		c=a+b;
		a=b;
		b=c;
	}
}
	public static void main(String[] args)
	{
	fibonacci(4);
	}
	
		
	
}

