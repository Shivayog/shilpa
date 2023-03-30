package Indiqube;

public class bubblesort 
{
public static void main(String[] args)
{
	

	int[] n= {9,5,4,6,2,8};
	for(int i=0;i<n.length;i++)
	{
		for(int j=i+1;j<n.length;j++)
		{
			if(n[i]>n[j])
			{
				int temp=n[i];
				n[i]=n[j];
				n[j]=temp;
			}
		}
	}
	for(int i=0;i<n.length;i++)
	{
		System.out.print(n[i]+" ");
	}
}
}
