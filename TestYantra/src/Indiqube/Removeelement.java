package Indiqube;

public class Removeelement 
{

	public static void main(String[] args)
	{
	int arr[]= {10,20,30,40,50};
		
//		System.out.println("Enter the removing index... ");
		
		int index=2	;
		int [] arr1= new int[arr.length-1];
		int temp=0;
		
		for (int i = 0; i < arr.length; i++)
		{
	       if(i!=index) 
	       {
			arr1[temp]=arr[i];
			temp++;
	       }
//	       else
//	    	   arr1[temp]=arr[i];
	    }
//		System.out.println("=====Updated array elements are... =====");
		for (int i = 0; i < arr.length-1; i++) 
//		{
			System.out.print(arr1[i]+" ");
//		}
	}
}
//	}
		