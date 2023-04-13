package Arrays1;

public class Second_smallest
{
public static int smallest(int a[])
{
	int smallest=Integer.MAX_VALUE;
	int second_smallest=Integer.MAX_VALUE;
	
	for(int i=0;i<a.length;i++)
	{
		
		
		if(a[i]<smallest)
		{
			smallest=a[i];
		}
		if(a[i]>smallest && a[i]<second_smallest)
		{
			second_smallest=a[i];
		}
		
	}
	return second_smallest;
}
public static void main(String[] args) 
{
	int []a= {1,3,4,2,6,8};
	int result=smallest(a);
	System.out.println("second smallest is  " + result );
}
}
