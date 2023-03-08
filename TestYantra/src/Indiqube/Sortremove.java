package Indiqube;

public class Sortremove
{
public static void main(String[] args)
{
	int[] a= {10,20,30,40,50};
	int n=20;

	  for(int i=0;i<a.length;i++)
	  {	if(n==a[i])
	  {
		 for(int j=i;j<a.length-1;j++)
			a[j] =a[j+1];
	  System.out.println("  remove the element  "+  n);
	  break;
		  
	  }
}
   System.out.println(" the new array is");
           for(int i=0;i<a.length-1;i++)
      System.out.println(a[i]+" ");
	}
}

