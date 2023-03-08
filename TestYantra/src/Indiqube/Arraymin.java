package Indiqube;

public class Arraymin 
{
public static void main(String[] args)
{
        int []a= {1,5,8,48,7,9};
		int min=a[0];
		int max=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
		
			if(a[i]<min) min=a[i];
			else if(a[i]>max) max=a[i];
		}
		System.out.println(min);
		System.out.println(max);
	}
	
}

