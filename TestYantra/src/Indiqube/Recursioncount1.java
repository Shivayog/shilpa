package Indiqube;

import java.util.Scanner;

public class Recursioncount1 
{
	  static int n1=1;
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=Sc.nextInt(); 
		  System.out.println(count(n));
		}
		
	public static int count(int n)
			{
		         if(n<=1)
		          {
			        return  n1;
		          }
		          else
		         {
			       n1++;
			       return count (n-1);
		         }
			}
	}
		    
		
		
		

		


	


