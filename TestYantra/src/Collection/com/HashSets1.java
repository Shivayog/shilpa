package Collection.com;

import java.util.HashSet;
public class HashSets1 
{
public static void main(String[] args) 
{
	HashSet hs =new HashSet();
	hs.add(20);
	hs.add(60);
	hs.add(22);
	System.out.println(hs);
	hs.add('s');
	hs.add("hash");
	System.out.println(hs);
	hs.add(null);
//	hs.add(null);
	System.out.println(hs);
	hs.add(20);
	System.out.println(hs);
	
	
}
}
