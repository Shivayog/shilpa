package pattern;

public class right_pyramid1
{
public static void main(String[] args) 
{
	int n=3;
	int star=1;
	int space=n-1;
	for(int i=1;i<2*n;i++)
	{
		for(int k=1;k<=space;k++)
		{
			System.out.print(" "+" ");
		}
		for(int j=1;j<=star;j++)
		{
			System.out.print("*"+" ");
		}
		if(i<n)
		{
			space--;
			star++;
		}
		else
		{
			space++;
			star--;
		}
		System.out.println();
	}
	
}
}
