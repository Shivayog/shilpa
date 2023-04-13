package Arrays;

public class repeat_element
{
public static void main(String[] args) 
{
	int []a= {1,2,3,1,5,6,5};
	int []a1=new int[a.length];
	for(int i=0;i<a.length;i++)
	{ 
		if( a1[a[i]]==1)
		{
			System.out.println(a[i]);
		}
		else
		{
			a1[a[i]]++;
		}
	}
	
}
}
