package numberprogram;

public class fact_sum
{
public static void main(String[] args) 
{
	int n=6;
	int sum=0;
	
	for(int i=1;i<=n;i++)
	{
		
		
		if(n%i==0)
		{
			sum=sum+i;
		}
	}	
	
	System.out.println("the fact of sum "+sum);
	

	
	
}
}
