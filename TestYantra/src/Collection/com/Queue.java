package Collection.com;

import java.util.ArrayDeque;

public class Queue
{
	public static void main(String[] args)
	{
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		ad.add(50);
		ad.add(20);
		ad.add("hello");
		ad.add('s');
		ad.add(22.2);
		ad.addFirst("shilpa");
		ad.addLast('R');
		System.out.println(ad);
		
	}

}
