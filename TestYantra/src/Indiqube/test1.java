package Indiqube;

public class test1 
{
	public static void main(String[] args)
	{
		int []a= {2,4,6,8};
		int min=0;
		int smin=0;
		for( int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				smin=min;
				min=a[i];
			}
			else if(a[i]<smin)
			{
				smin=a[i];
			}
		}
		System.out.println(smin);
	}

}
