package Indiqube;

public class insertion 
{
	public static void main(String[] args)
	{
		int [] a= {5,4,2,7,9};
		for(int i=1;i<a.length;i++)
		{
			int j=0;
			while(a[i]<a[j] &&j<i )
			{
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				j++;
			}
		}
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
		
	}
	

}
