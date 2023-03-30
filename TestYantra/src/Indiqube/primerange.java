package Indiqube;

import java.util.Scanner;

public class primerange 
{
public static void main(String[] args)
{
	
	
		
		int f=1;
		int l=20;
		
			for(int i=f;i<=l;i++) {
			
				int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					
					count++;
				}
			}
			if(count==2) 
			{
				System.out.println(i+" ");
			}
			
		}
		
	}


}

