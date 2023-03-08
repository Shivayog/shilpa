package Indiqube;

public class Demo1
{
public static void main(String[] args) 
{
	int[]a= {2,4,5};
	int[]b= {7,8};
	boolean flag=true;
	for(int i=0;i<a.length;i++)
	{
		flag=false;
	
		
		for(int j=0;j<b.length;j++)
		if(a[i]==b[j])
		{
			flag=false;
			break;
		}
	}

           if(flag==true)
            {
	         System.out.println("  present");
             }
          else
           {
        	System.out.println(" not present");
             }

}
}

