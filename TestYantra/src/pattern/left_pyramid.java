package pattern;

public class left_pyramid 
{
	public static void main(String[] args) 
	{
		int n=3;
		int star=1;
		for(int i=1;i<n*2;i++)
		{
			for(int j=1;j<=star;j++ )
			{
				System.out.print("*"+" ");
			}
		
		if(i<n)
		{
			star++;
		}
		else
		{
			star--;
		}
		System.out.println();
		}
	}

}
