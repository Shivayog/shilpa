package Indiqube;

import java.util.Scanner;

public class Array2d 
{
public static void main(String[] args) 
{
	int a[][]=new int[2][2];
		Scanner Sc=new Scanner(System.in);
//		System.out.print(a[0][0]+" ");
//		System.out.println(a[0][1]+" ");
//		System.out.print(a[1][0]+" ");
//		System.out.println(a[1][1]+" ");
	for(int i=0;i<a.length;i++)
	{
		System.out.println("enter the data for row");
		for(int j=0;j<a[i].length;j++)
		{
			a[i][j]=Sc.nextInt();
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
}
