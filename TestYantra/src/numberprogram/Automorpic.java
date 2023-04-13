package numberprogram;

import java.util.Scanner;

public class Automorpic 
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	  System.out.println("Enter a num:");
//    
      int n = Sc.nextInt();
//	int n=7;
      
      int sqr=n*n;
      int count=0;
      int count1=0;

      
      while(n!=0) 
      {
    	count++; 
    	int d1=n%10;
    	int d2=sqr%10;
    	if(d1==d2) 
    	{
    		count1++;
    	}
      
      n=n/10;
      sqr=sqr/10;
      }
      if(count==count1)
      {
    	 System.out.println("it is automorphic"); 
      }
      else
      {
    	  System.out.println("not automorphic");
      }

}

}


