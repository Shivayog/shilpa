package Indiqube;

public class Array2dbigelementrow
{
public static void main(String[] args) 
{
	int a[][]={{10,20,30},{70,80,20},{40,50,60},{10,20,30} };
	for(int i=0;i<a.length;i++)
	{
		int max=a[i][0];
		for(int j=0;j<a[i].length;j++)
		{
			if(a[i][j]>max)
			{
				max=a[i][j];
			}
			System.out.print(max+" ");
		}
		System.out.println();
	}
}
}
