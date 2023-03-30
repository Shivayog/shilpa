package Indiqube;

import java.util.HashSet;

public class missingnumbers_arrays 
{
public static void main(String[] args)
{
Integer a[]= {0,1,2,4,5,6};
missingnumbers(a);
}

public static void missingnumbers(Integer a[] )
{
	HashSet<Integer> set=new HashSet<Integer>();
	for(int n:a)
	{
		set.add(n);
	}
	int n1=a.length+1;
	for(int i=0;i<n1;i++)
	{
		if(!set.contains(i))
		{
			System.out.println(i);
		}
	}
}
}
