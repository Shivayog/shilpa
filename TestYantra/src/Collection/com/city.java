package Collection.com;

import java.util.Iterator;
import java.util.TreeSet;



public class city 
{
public static void main(String[] args)
{
	TreeSet ts=new TreeSet();
	ts.add("banglore");
	ts.add("delhi");
	ts.add("kolkat");
	ts.add("uttar pradesh");
	ts.add("gadag");
	System.out.println(ts);
	Iterator itr=ts.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
}
}
