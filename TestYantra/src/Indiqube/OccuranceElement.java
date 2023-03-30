package Indiqube;

import java.util.Arrays;

public class OccuranceElement
{
public static void main(String[] args) 
{
	int[]a= {1,2,3,4,4,5,6,7,8,9,3,2,};
	count(a);
}
static void count(int[]a)
{
	Arrays.sort(a);
	for(int i=0;i<a.length-1;i++) 
	{
		int count=1;
		if(i!=a.length-1)
		{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
				count++;
			else
				break;
		}
	}
	System.out.print(a[i]+" ");
	i+=(count-1);
}
}
}
