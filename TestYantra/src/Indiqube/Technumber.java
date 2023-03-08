package Indiqube;

import java.util.Scanner;

public class Technumber
{

	public static void main(String[] args)
	{
			Scanner Sc=new Scanner(System.in);
			System.out.println("enter the number");
				int n=Sc.nextInt();
				 int count=0;
				 int sum=0;
				 int rem=0;
				 int d=0;
				 int sq=0;
			
				 while(n!=0)
				 {
					 rem=n%100;
					 count++;
				 	n=n/100;
				 
				 if(d%2==0)
				 {
					 int n1=d/2;
					 int p=(int)Math.pow(10,n1);
					 int l=n/p;
					 int r=n%p;
				     sum=(l+r);
			         sq=sum*sum;	 
				      if(sq==n)
			      	 {
					   System.out.println("it is tech num");
				     }
			    	 else
			    	 {
					 System.out.println("it is not tech num");
			     	 }
				      
					 }		 
				 } 
	}
}


