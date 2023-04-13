package Arrays1;

public class segregate_0_1 
{
public static void main(String[] args) 
{
	int a[]= {1,0,1,1,1,0,0,0,1,10,1,1,0};
	int j=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==0)
		{
			a[j++]=a[i];
		}
	}
	while(j<a.length)
	{
		a[j++]=1;
	}
	for(int k=0;k<a.length;k++)
	{
		System.out.print(a[k]);
	}
}
}
