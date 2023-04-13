package Arrays;

public class SquareArray_sort 
{
public static void main(String[] args)
{
	int[]a= {-6,-1,2,4,5};
	int [] squareArray=squareSortedArray(a);
	for(int i=0;i<squareArray.length;i++)
	{
		System.out.println(squareArray[i]);
	}
}

private static int[] squareSortedArray(int[] a)
{
	int []squareArray=new int[a.length];
	int start=0;
	int end=a.length-1;
	int Squareindex=a.length-1;
	while(start<=end)
	{
		if(a[start]*a[start]>a[end]*a[end])
		{
			squareArray[Squareindex--]=a[start]*a[start];
			start++;
		}
		else
		{
			squareArray[Squareindex--]=a[end]*a[end];
			end--;
			}
	}
	return squareArray;
}
}
