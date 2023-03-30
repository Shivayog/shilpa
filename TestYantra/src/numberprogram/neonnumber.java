package numberprogram;

import java.util.Scanner;

public class neonnumber 
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=Sc.nextInt();
//	int n=9;
	int sqr=n*n;
	int sum=0;
	
	while(sqr>0)
	{
		int res=sqr%10;
		sum=sum+res;
		sqr=sqr/10;
	}
	if(sum==n)
	{
		System.out.println("neon num");
	}
	else 
	{
		System.out.println("not neon num");
	}

}


}

