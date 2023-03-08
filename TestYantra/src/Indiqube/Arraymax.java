package Indiqube;

public class Arraymax 
{
public static void main(String[] args)
{
//	int max=0;
	int []a=new int[5];
	int max=a[0];
	a[0]=20;
	a[1]=50;
	a[2]=67;
	a[3]=22;
	a[4]=28;
	for(int i=0;i<a.length;i++)
	{
	
		if(a[i]>max) 
		{
			max=a[i];
		}
		
//		System.out.println(max);
		
	}
	System.out.println(max);
}
}
