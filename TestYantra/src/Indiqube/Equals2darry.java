package Indiqube;

public class Equals2darry 
{
public static void main(String[] args) 
{
	int [][]a={{10,20,30},{70,80,20},{40,50,60},{10,20,30}};
	int b[][]={{40,50,60},{10,20,30,},{70,80,90},{40,50,60}};
	boolean flag=false;
	for(int i=0;i<a.length;i++)
	{
	    
		for(int j=0;j<a[i].length;j++)
		{
			if(a[i][j]!=b[i][j])
			{
				flag=true;
				break;
			}
		}
	}
	
			
		
			   if(flag==true)
				{
					System.out.print(" not same");
				}
				else
				{	
					System.out.println(" same");
			     }
	
}

}


