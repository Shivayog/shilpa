package Indiqube;

public class Linearindex 
{
public static int linear(int[]a ,int n)
{
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==n)
		{
			return i;
		}
	}
	
		return 0;
	
}
public static void main(String[] args)
{
	int []a1= {10,20,30,60};
	int n=60;
	System.out.println(n  + "  index:   "+linear(a1,n));
}
	
}


