package Collection.com;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEach {
	public static void main(String[] args) {
       
		ArrayList  a1 = new ArrayList();
		a1.add(12);
		a1.add(20);
		a1.add(30);
		a1.add("abc");
		a1.add('c');
		a1.add(null);
		a1.add(0.5);
		a1.add(0.22d);
		System.out.println(a1);
		
		for (Object obj : a1) {
			System.out.println(obj);
		}
		
	}
  
  
  
}
