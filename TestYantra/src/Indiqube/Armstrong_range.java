package Indiqube;

public class Armstrong_range 
{
	public static void main(String[] args)
	{
		for(int i=20;i<500;i++)
		{
			int n=i;
			int sum=0;
			int count=0;
			while(n>0)
			{
				int r=n%10;
				sum=sum+r*r*r;
				n=n/10;
			}
		if(sum==i)
		{
		
		System.out.println(sum);
		}
		}
		
	}
}
