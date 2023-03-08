package Indiqube;

public class Selectionsort
{
public static void main(String[] args)
{
	int[] n= {5,89,4,7,2,6};
	for(int i=0;i<n.length-1;i++)
	{
		int index=i;
		for(int j=i+1;j<n.length;j++)
		{
			if(n[j]<n[index])
				index=j;
		}
		if(i!=index)
			{
				int temp=n[index];
				n[index]=n[i];
				n[i]=temp;
			}
			
		}
	
	for(int i=0;i<n.length;i++)
	{
		System.out.print(n[i]+" ");
	}
		}
	
}

