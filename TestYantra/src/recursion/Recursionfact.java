package recursion;

import java.util.Scanner;

public class Recursionfact
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=Sc.nextInt();
	System.out.println(fact(n));
	
}

private static int  fact(int n)
{
	if(n<=1)
	{
		return 1;
	}
	else
	{
		return n*fact(n-1);
	}
	
}
}

