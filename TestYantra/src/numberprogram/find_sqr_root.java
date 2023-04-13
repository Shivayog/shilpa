package numberprogram;

public class find_sqr_root 
{
public static void main(String[] args)
{
	int n=16;
	for(int i=1;i<=n;i++)
	{
		if(i*i==n)
		{
			System.out.println(" it is a sqr of "+i);
			break;
		}
		else
		{
			System.out.println(" it is not a sqr of "+i);
		}
	}
}
}
