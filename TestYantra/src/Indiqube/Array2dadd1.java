package Indiqube;

public class Array2dadd1
{
public static void main(String[] args) 
{
	int a[][]={{10,20,30},{70,80,20},{40,50,60},{10,20,30}};
	int b[][]={{40,50,60},{10,20,30,},{70,80,90},{40,50,60}};
	int i=0;
	int j=0;
	int sum [][]=new int [i][j];

	for(  i=0;i<a.length;i++)
	{  
		for(  j=0;j<b.length;j++)
		{
			sum[i][j]= a[i][j]+b[i][j];
			System.out.println();
		}
	}
	for( i=0;i<a.length;i++)
	{
		for( j=0;j<b.length;j++)
		{
			System.out.print(sum[i][j]+" ");
		}
		System.out.println();
	}
		
	}
}


