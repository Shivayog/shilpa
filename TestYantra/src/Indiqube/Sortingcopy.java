package Indiqube;

public class Sortingcopy 
{
	public static void main(String[] args) 
	{
		
	
int[] a= {10,20,30,40,50};
int n=100;
int index=5;
int []a1=new int[a.length+1];
  for(int i=0;i<index;i++)
  {	
	  a1[i]=a[i];
	  
  }
	  a1[index]=n;
  
  for(int i=index+1;i<a1.length;i++)
  {
	  a1[i]=a[i-1];
  }
  for(int i=0;i<a1.length;i++)
	  System.out.println(a1[i]+" ");
  }
}


