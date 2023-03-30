package Indiqube;

import java.util.Arrays;

public class Arrayreverse1
{
public static void main(String[] args) 
{
	int []a= {1,2,3,5};
	int i=0;
	int j=a.length-1;
	int temp=0;
  
           while(i<j)
           {
		 	temp=a[i];
	         a[i]=a[j];
	        a[j]=temp;
	        i++;
	        j--;
	        }
		
	
	System.out.println(Arrays.toString(a));
}
}

