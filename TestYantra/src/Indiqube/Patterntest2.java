package Indiqube;

public class Patterntest2
{
public static void main(String[] args)
{
	int n=7;
	for(int r=n;r>=1;r--)
	{
		for( int c=1;c<=n-r;c++)
		{
			System.out.print(" ");
		}
		
		for(int k=1;k<=2*r-1;k++)
		{
		System.out.print("*");
		}
		
		
		System.out.println();
	}
		
	
	
	
}
}
