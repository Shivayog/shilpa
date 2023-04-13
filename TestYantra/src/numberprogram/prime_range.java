package numberprogram;

public class prime_range 
{
public static void main(String[] args) 
{
	
	for(int i=20;i<=40;i++)
	{
//		int n=i;
		int count=0;

		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
	
	if(count==2)
	{
		System.out.println(i);
	}
	}
		
	
}
}
