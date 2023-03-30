package Collection.com;

import java.util.HashSet;
//import java.util.ArrayList;
import java.util.LinkedList;

public class Foreach1 
{
	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		

	
		ll.add(20);
		ll.add(60);
		ll.add(22);
		System.out.println(ll);
		ll.add('s');
		ll.add("hash");
		System.out.println(ll);
		for (Object o : ll) 
		{
			System.out.println(o);
		}
		
	}

}
