package Collection.com;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

public class age1 
{
public static void main(String[] args) 
{
	LinkedList ls=new LinkedList();
	
			
			ls.add(22);
			ls.add("shilpa");
			ls.add(23);
			ls.add("shweta");
			ls.add(24);
			ls.add("shiva");
			ls.add(26);
			ls.add("prema");
			ls.add(29);
			ls.add("preti");
			Iterator itr=ls.iterator();
			while(itr.hasNext())
			{
				int age=(int)itr.next();
				String name=(String)itr.next();
				if(age%2==0)
				{
					System.out.println(name+" "+age);
				}
			}
			

}
}
