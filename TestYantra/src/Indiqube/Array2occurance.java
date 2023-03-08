package Indiqube;

//import java.util.Scanner;

public class Array2occurance 
{

public static void main(String[] args) 
{
	int [] a= {10,20,40,50,40,60};
	
	boolean flag=true;
int c=0;


	 for(int i=0;i<a.length;i++)
	{
		
		if( a[i]==40) 
		{
		c++;

		if(c==2)
		{
			flag=true;
			break;
		}
		if( flag==true )
		{
			System.out.println(a[i]+" present");
			
		}
		else
		{
			System.out.println( a[i]+ "not present");
		}
		
		
		
	}	
	}
}
}



