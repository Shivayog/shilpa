package Indiqube;

public class secondmax 
{
public static void main(String[] args)
{
	int[]a= {22,34,56,78,99};	
	int min=a[0];
	int smin=a[0];

	for(int i=0;i<a.length;i++)
	{ 
		     
		
	            if(a[i]<min)
	            {
				  smin=min;
				  min=a[i];
				  
	            }
	
	            else if(a[i]<smin)
	            smin=a[i];
	     
				
	}
	System.out.println(smin);

	
}
}
