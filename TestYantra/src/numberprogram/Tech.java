package numberprogram;

import java.util.Scanner;

public class Tech 
{ 

	public static void main(String[] args) 
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter num: ");
	int n=sc.nextInt();
		int count=0;
		int temp=n;
		
		while(n>0)
		{
		
			count++;
			n/=10;
	}

		if(count%2==0)
		{
			count/=2;
			int a=1;
			
			for(int i=1;i<=count;i++)
			{
				a=a*10;
			}
			int num1=temp%a;
			int num2=temp/a;
			int sum=num1+num2;
			int sq=sum*sum;
			if(sq==temp)
			{
				System.out.println("Tech num");
			}
			else
			{
			System.out.println("Not Tech...");
			}
			
	}
		else
		{
			System.out.println("Not Techhh");
		}
		
	
		
	}

}

