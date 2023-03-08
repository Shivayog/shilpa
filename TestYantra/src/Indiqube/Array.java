package Indiqube;

public class Array 
{
	public static void main(String[] args)
	{	
       int sum=0;
        int[] a=new int[5];

        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=50;
        a[4]=10;
        for(int i=1;i<=5-1;i++)
        {
        	sum=sum+a[i];
        }
        System.out.println(sum);
}
}
