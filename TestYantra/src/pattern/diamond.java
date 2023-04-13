package pattern;

public class diamond 
{
public static void main(String[] args) 
{int n=5;
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
			star=star+2;
		}
		else
		{
			space++;
			star=star-2;
		}
		System.out.println();
	}
	
}
}
