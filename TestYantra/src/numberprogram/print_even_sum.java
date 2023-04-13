package numberprogram;

public class print_even_sum 
{
	public static void main(String[] args) {
		
	
	int sum=0;
	for(int i=2;i<=10;i++)
	{
		if(i%2==0)
		{
			sum=sum+i;
		}
	}
	System.out.println( "sum is "+sum);
	

}}
