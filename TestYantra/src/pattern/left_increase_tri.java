package pattern;
//                  * 
//                * * 
//              * * * 
//            * * * * 
//          * * * * * 


public class left_increase_tri
{
public static void main(String[] args)
{
	int n=5;
	for(int r=1;r<=5;r++)
	{
		for(int k=1;k<=n-r;k++)
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
