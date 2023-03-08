package Indiqube;

public class Uppertri2darry 
{
public static void main(String[] args)
{
	int a[][]= {{10,20,30},{22,24,25},{20,64,68}};
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
			
		
		if(i>j)
		{
			System.out.print("00"+"   ");
		}
		else
		{
		System.out.print( a[i][j]+"   ");
		}
	
	System.out.println();
}

	}
}

