package Subarrays;

public class Sum_equals_key 
{
public static void main(String[] args)
{
	int[]a= {1,4,20,3,10,5};
	int count=0;
	int k=33;
	for(int i=0;i<a.length;i++)
	{
		int sum=0;
		for(int j=i;j<a.length;j++)
		{
			sum=sum+a[j];
			if(k==sum)
			{
				count++;
			}
		}
	}
	System.out.println(count);
}
}
