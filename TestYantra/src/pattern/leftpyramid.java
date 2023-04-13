package pattern;

public class leftpyramid 
{
public static void main(String[] args) 
{
	int n=5;
	for(int r=(-n)+1;r<n;r++)
	{
		int a=r;
		if(a<0)
		{
			a=-a;
		}
		for(int c=n-1;c>=0;c--)
		{
//			if(a>=c)
			if(a>=c)
			{
				System.out.print("  ");
			}
			else
			{
				System.out.print("*");
			}
		}
		System.out.println();
	}
}
}
