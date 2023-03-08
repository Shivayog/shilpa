package Indiqube;

public class P8 
{
public static void main(String[] args)
{
	int n=5;
	for(int r=5;r>=1;r--)
	{
		for(int c=n;c>r;c--)
		    {
			System.out.print("  ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("* ");
			}
			  System.out.println();
	}
	
}
}
