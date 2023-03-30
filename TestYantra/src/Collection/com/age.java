package Collection.com;


import java.util.Iterator;
import java.util.LinkedList;

import java.util.Scanner;


public class age 
{
	public static void main(String[] args) 
	{ 
		LinkedList ls=new LinkedList();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name:");
		String s=sc.next();
		
		System.out.println("enter the age:");
		int a=sc.nextInt();
		
		
		ls.add(s);
		ls.add(a);
		
		
		if(a%2==0) 
		{
			Iterator itr=ls.iterator();
			while(itr.hasNext()) 
			{
				System.out.println(itr.next());
			}
		}
		
		else System.out.println("Age is not even");
	}

}
		
		
		
		
		
		
		
		


