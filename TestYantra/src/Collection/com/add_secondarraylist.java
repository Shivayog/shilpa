package Collection.com;

import java.util.ArrayList;

public class add_secondarraylist
{
public static void main(String[] args)
{
	ArrayList al=new ArrayList();
	al.add(10);
	al.add("hi");
	al.add('s');
	al.add(null);
	System.out.println(al);
	
	ArrayList al2=new ArrayList();
	
	al2.add("hello");
	al2.add(10);
	al2.add('#');
	al2.add('o');
	System.out.println(al2);
	al.addAll(al2);
	System.out.println(al);
	
	
}
}
