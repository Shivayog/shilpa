package Indiqube;

public class RemoveDuplicate
{
public static void main(String[] args)
{
	int []a= {5,4,3,2,2,5};
	int[]a1=new int[a.length];
	int j=0;
	for(int i=0;i<a.length-1;i++)
	{
//		for(int j=0;j<a.length;j++)
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
