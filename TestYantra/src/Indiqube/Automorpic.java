package Indiqube;

import java.util.Scanner;

public class Automorpic 
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	  System.out.println("Enter a num:");
    
      int n = Sc.nextInt();
      
      int sqr=n*n;
      boolean flag=true;
      while(n>0) 
      {
    	  if(n%10==sqr%10) 
    	  {
    		n=  n/10;
    	  sqr=  sqr/10;
    	  } 
    	  else {
    		  flag=false;
    		  break;
    	  }
      }
    	  if(flag==true)
    	  {
    		  System.out.println("Automporpic");
    	  }
    	  else 
    		  {
    		  System.out.println("Not Automorphic");
    		  }

}

}


