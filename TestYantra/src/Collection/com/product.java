package Collection.com;

import java.util.HashSet;
import java.util.Iterator;
public class product
{
public static void main(String[] args)

{
	HashSet hs=new HashSet();
	hs.add(1);
	hs.add(2);
	hs.add(3);
	hs.add(4);
	hs.add(6);
	int p=1;
	Iterator itr=hs.iterator();
	while(itr.hasNext())
	{
		int n=(int)itr.next();
		p=p*n;
	}
	System.out.println(p);
}
}

