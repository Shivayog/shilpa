package Indiqube;

public class Array2dadd
{
public static void main(String[] args)
{
	int a1[][]= {{10,20,30},{70,80,20},{40,50,60}};
	
	
int []sum=new int[3];
	for(int i=0;i<a1.length;i++)
	{
	
		for(int j=0;j<a1[i].length;j++)
		{
			sum[i]+=a1[i][j];
		}
	}
		for(int a :sum)
		{
			System.out.print(a+" ");
		}		
		System.out.println();
		
	}
}

