package Indiqube;

public class Arraymerg
{
public static void main(String[] args) 
{
	int[] a={2,4,9,6,3};
	int []b= {5,7,8,};
	
	int[]c=new int [a.length+b.length];
	
	for(int i=0;i<=a.length;i++)
	{
		for(int j=0;j<b.length;j++)
	
		if(i<a.length)
		{
			c[i]=a[j];
		}
		else
		{
		c[i]=b[j++];	
		}
		}
	for(int i=0;i<c.length;i++)
	{
		System.out.println(c[i]);
	}
	}
}
	