package Arrays1;

public class Insertion_sort
{
public static void insertion( int a[]) 
{
	int temp;
	int j;
	for(int i=1;i<a.length;i++)
	{
		temp=a[i];
		j=i-1;
	
	while(j>=0&&temp<a[j])
	{
		a[j+1]=a[j];
		j=j-1;
	}
	a[j+1]=temp;
}
}
public static void main(String[] args)
{
	int a[]= {9,7,5,10,2,1};
	 insertion(a);
	 for(int k=0;k<a.length;k++)
	 {
		 System.out.print(a[k]+" ");
	 }
	
}
}
