package Indiqube;

public class Indentityarray 
{
public static void main(String[] args) 
{
	int []a= {3,4,6,7};
	int []b= {8,4,6,7};
	boolean flag=true;
	if(a.length==b.length)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				flag=false;
				break;
			}
		}
	}
	if(false)
		System.out.println("not identical");
	else
		System.out.println("identity");
	
}
}
