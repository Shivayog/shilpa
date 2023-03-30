package Tyss;

public class linearsearch
{
public static void main(String[] args)
{
	int[]a= {10,20,40,60,80};
	int key=70;
	boolean flag=false;
	for(int i=0;i<a.length;i++)
	{
		if(key==a[i])
		{
			
		flag=true;
			break;
		}
	}
	if(flag==false)
		System.out.println("key   not found");
//	
	else
	{
		System.out.println("key found");
	}
	
	
}}
//}
