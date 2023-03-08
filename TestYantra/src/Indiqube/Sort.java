package Indiqube;
//Sortdesending
public class Sort
{
public static void main(String[] args)
{
	
//	sort(n);
//	for(int a:n) System.out.print(a +" ");


		int[] n= {9,5,4,6,2,8};
		for(int i=0;i<n.length;i++)
		{
			for(int j=0;j<n.length-1-i;j++)
			{
				if(n[j]>n[j+1])
				{
					int temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i]+" ");
		}
	
	
}
}