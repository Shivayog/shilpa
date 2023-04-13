package Arrays1;

import java.util.HashSet;
import java.util.Set;

public class duplicate_element
{
public static void main(String[] args) 
{
	int []a= {1,7,3,5,2,3,2};
	boolean flag=false;
	Set<Integer> s=new HashSet<>();
	for(int i=0;i<a.length;i++)
	{
		if(s.contains(a[i]))
		{
			flag=true;
			System.out.println(a[i]);
		}
		else
		{
			s.add(a[i]);
		}
	}
	if(!flag)
	{
		System.out.println(-1);
	}
	
}
}
