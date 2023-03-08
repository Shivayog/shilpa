package Indiqube;

public class Array2dcol 
{
public static void main(String[] args)
{
	int a1[][]= {{10,20,30},{70,80,20},{40,50,60},{10,20,30} };
	
	
	int []sum=new int[4];
		for(int i=0;i<a1.length;i++)
		{
		
			for(int j=0;j<a1[j].length;j++)
			{
				sum[j]+=a1[i][j];
			}
		}
			for(int a :sum)
			{
				System.out.print(a+" ");
			}		
			System.out.println();
			
		}
	


}

