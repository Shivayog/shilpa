package Indiqube;

public class Arraydistinct
{
	public static void main(String[] args)
	{
		
		int [] a= {10,20,30,40,50};
		int[]b= {10,40,60,78,50,90};
		
		
		for(int i=0;i<a.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<a.length;j++) {
			    if(a[i]==b[j])
			    {
			    flag=true;
			    break;
			    }
			}
			if(!flag)
			{
				System.out.println(a[i]);
			}
		}
//		for(int i=0;i<b.length;i++)
//		{
//			boolean flag=false;
//			for(int j=0;j<a.length;j++) {
//			    if(b[i]==a[j])
//			    {
//			    flag=true;
//			    break;
//			    }
//			}
//			if(!flag)
//			{
//				System.out.println(b[i]);
//			}
//		}
		
		
	}
}


