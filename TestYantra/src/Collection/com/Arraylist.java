package Collection.com;

import java.util.ArrayList;

public class Arraylist 
{
public static void main(String[] args) 

{
	ArrayList a1=new ArrayList();
	
//	add method
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add("abc");
	a1.add('c');
	a1.add(null);
	a1.add(0.5);
	a1.add(0.22d);
	System.out.println(a1);
	
	System.out.println("==================");
//	remove method

	a1.remove("abc");
	a1.remove(2);
	System.out.println(a1);
	
	ArrayList a12=new ArrayList();
	
//	AddAll METHOD
	a12.add(100);
	a12.add("rick");
	a12.add('&');
System.out.println(a12);
a1.addAll(a12);
System.out.println("==================");
System.out.println(a1);

System.out.println("=====================");
a1.removeAll(a12);
System.out.println(a1);

//Retainmethod
a1.addAll(a12);
System.out.println(a1.retainAll(a12));
System.out.println(a1);
//	Searching method
System.out.println("======================");
System.out.println(a1.contains(100));

System.out.println("======================");
	ArrayList a3=new ArrayList();
	a3.add(50);
	a3.add(70);
	a3.add(90);
	a12.addAll(a3);
	System.out.println("==================");
	System.out.println(a12.contains("rick"));
	
	
	
}
}
