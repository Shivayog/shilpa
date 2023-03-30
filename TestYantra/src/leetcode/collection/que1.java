package leetcode.collection;

public class que1 
{
	
	public static void main(String[] args) 
	{
		int []a= {0,0,1,1,1,2,2,2,3,3,4,};
		int j=0;
		int[]a1= new int [a.length];
		for(int i=0;i<a.length-1;i++)
		{
		if(a[i]!=a[i+1])
		{
			a1[j++]=a[i];
		}
	}
	a1[j++]=a[a.length-1];
	for(int k=0;k<j;k++)
	{
		System.out.println(a1[k]);
	}
			
			
		
	
	}
}
