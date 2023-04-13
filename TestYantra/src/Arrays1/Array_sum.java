package Arrays1;

public class Array_sum 
{
public static void main(String[] args) 
{
	int []a= {1,2,3,4,5,6,7};
	int sum=9;
	int i=0;
	int j=a.length-1;
	
	while(i<j)
	
	{
		
			if(a[i]+a[j]>sum)
			{
				j--;
			}
			else if(a[i]+a[j]<sum)
			{
				i++;
			}
			else if(a[i]+a[j]==sum)
			{
					
				System.out.println("pair("+a[i]+","+a[j]+")");
				i++;
				j--;
			
		
            }
		
        }

}
}

