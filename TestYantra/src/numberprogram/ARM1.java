package numberprogram;

public class ARM1 
{
	public static void main(String[] args) 
	{
		int n=153;
		int n1,rem,res=0;
		n1=n;
		while(n1!=0)
		{
			rem=n%10;
			res=(int) (res+Math.pow(rem, 1));
			res=res/10;
		}
		if(res==n)
		{
			System.out.println("armstrong.");
			
		}
		else 
		
			System.out.println("not.");
		
	}
}

