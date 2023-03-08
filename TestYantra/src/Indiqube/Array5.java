package Indiqube;

public class Array5
{
public static void main(String[] args) 
{
	int p=1;
	int []a=new int[3];
	a[0]=1;
	a[1]=2;
	a[2]=4;
	for(int i=0;i<a.length;i++)
	{
		p=a[i]*a[i]*a[i];
	}
	System.out.println(p);
	
	
}
}
