package Collection.com;

import java.util.LinkedList;

public class novels
{
public static void main(String[] args)
{
	LinkedList ll=new LinkedList();
	ll.add("mahabharat");
	ll.add("ramayanna");
	ll.add("panchatantra");
	ll.add("wings of flower");
	ll.add("kate dabbi");
	System.out.println(ll);
	LinkedList l2=new LinkedList();
	l2.add(ll);
//	System.out.println(l2);
	ll.addAll(l2);
System.out.println(ll);
	
	
}
}
