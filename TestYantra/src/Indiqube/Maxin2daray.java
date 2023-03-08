package Indiqube;

public class Maxin2daray 
{
public static void main(String[] args) 
{
	int [][]a={{10,20,30},{70,80,20},{40,50,60},{10,20,30}};
//	int b[][]={{40,50,60},{10,20,30,},{70,80,90},{40,50,60}};
	int max=a[0][0];
	for(int i=0;i<a.length;i++)
	{
	    
		for(int j=0;j<a[i].length;j++)
		{
			if(a[i][j]>max)
			{
				max=a[i][j];
				
			}
		}	
			
			
}
	System.out.println(max);
}

}
