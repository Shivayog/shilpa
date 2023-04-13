package Arrays1;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Remove_duplicate 
{
public static void removeduplicate( int a[]) 
   {
	Arrays.sort(a);
	int  j=0;
	int len=a.length;
	for(int i=0;i<a.length-1;i++)
	{
	
			if(a[i]!=a[i+1])
			{
			a[j++]=a[i];	
			}
		
	}
	a[j++]=a[len-1];
	for(int k=0;k<j;k++)
	{
		System.out.println(a[k]+" ");
	
	}
   }
//method 2 using Hashmap
public static void removeduplicatehashmap(int a[])
{
      Map<Integer,Integer> map =new HashMap<>();
      int len=a.length;
      for(int i=0;i<len-1;i++)
      {
    	  if(map.containsKey(a[i]))
    	  {
    		  map.put(a[i],map.get(a[i])+1);
    	  }
    	  else
    	  {
    		  map.put(a[i], 1);
    	  }
      }
   map.forEach((k,v)->System.out.print(k+" "));
}
//method 3 using set
public static void removeduplicateset
(int a[])
{
	Set<Integer> st=new HashSet<>();
	int len=a.length;
	for(int i=0;i<a.length;i++)
	{
		st.add(a[i]);
	}
	st.forEach(ele->System.out.print(ele+" "));;
}

   public static void main(String[] args)
{
	int []a= {5,1,2,3,4,4,5};
	
	removeduplicate(a);
	System.out.println();
	
	removeduplicatehashmap(a);
	System.out.println();
	
	
	removeduplicateset(a);
	System.out.println();

   }

}


