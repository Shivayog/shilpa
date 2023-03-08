package Indiqube;

public class Arraysum
{
public static void main(String[] args)
{
	int[]n= {1,3,5,8,9,9,6,7};
	for(int i=0;i<n.length;i++)
	{
		for(int j=i+1;j<n.length;j++)
		if(n[i]+n[j]==15)
		{
			System.out.println(n[i]+"+"+n[j]+"=15");
		
		}
	}
}}
