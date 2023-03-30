package Collection.com;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets
{
public static void main(String[] args) 
{
	LinkedHashSet hs=new LinkedHashSet();
	hs.add(10);
	hs.add(20);
	hs.add(40);
	hs.add(50);
	System.out.println(hs);
	hs.add(null);
//	hs.add(null);it's allow only one null value
	System.out.println(hs);
	hs.add(10);
	System.out.println(hs);
	Iterator itr=hs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
}
}
