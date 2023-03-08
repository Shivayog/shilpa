package Tyss;

public class binarysearch 
{
public static void main(String[] args)
{
	int[]a= {10,20,40,60,80};
	int key=80;
	int low=0;
	boolean flag=false;
	int high=a.length-1;
	int mid=(low+high)/2;

	while(low<=high)
	{
		mid=(low+high)/2;
	if(key==a[mid])
	{
	//System.out.println("key is present "+mid);
		flag=true;
	break;
	}
	else if(key>a[mid])
	{
	low=mid+1;
	high=high;
	}
	else if(key<a[mid])
	{
		high=mid-1;
		low=low;
	}
	}
if(flag==true)System.out.println("key found " +mid);
	else
		System.out.println("key is not found");
	}
}


