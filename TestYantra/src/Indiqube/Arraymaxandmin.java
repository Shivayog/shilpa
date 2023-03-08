package Indiqube;

public class Arraymaxandmin 
{
public static void main(String[] args)
{
	int[]a= {22,34,56,78,99};	
	int max=a[0];
	int max2=a[0];

	for(int i=1;i<a.length;i++)
	{ 
		     
		
	            if(a[i]>max)
	            {
				  max2=max;
				  max=a[i];
				  
	            }
	
				else if(a[i]>max2)
	            max2=a[i];
	     
				
	}
	System.out.println(max2);

}
}

