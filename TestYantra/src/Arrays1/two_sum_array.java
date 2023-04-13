package Arrays1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class two_sum_array 
{
public static int[] twosum( int a[],int target)
{
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[j]==(target-a[i]))
			{
				return new int [] {i,j};
			}
		}
	}
	throw new IllegalArgumentException("no pair is found");
	
}


public static int[] twosumHash( int a[],int target)
{
	Map<Integer, Integer> m= new HashMap<>();
	for(int i=0;i<a.length;i++)
	{
		m.put(a[i],i);
	}
	for(int i=0;i<a.length;i++)
	{
		int atofind=target-a[i];
		if(m.containsKey(atofind) && m.get(atofind)!=i)
		{
			return new int [] {i, m.get(atofind)};
		}
	}
	return a;
	
}


public static void main(String[] args) 
{
	int []a= {2,7,11,15};
	int target=18;
	System.out.println(Arrays.toString(twosum(a,target)));
	System.out.println(Arrays.toString(twosumHash(a,target)));
}
{
	
}
}
