package Indiqube;

public class Arraycommon
{
public static void main(String[] args)
{
	int [] a= {10,20,30,20,40,50 ,10};
	
//	int[]b= {10,40,60,78,50,90};

	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		if(a[i]==a[j])
		{
				System.out.println(a[i]);
		}
			
			
		}
	}
}


