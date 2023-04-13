package pattern;

import java.util.Scanner;

public class Pyramidnumber_1
{
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the nunber");
		int n=Sc.nextInt();
		
		for(int r=1;r<=n;r++)
		{
			
			for(int c=1;c<=n-r;c++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=2*r-1;k++)
//			for(int k=0;k<=r;k++)
			{
				if(r%2==0) {
				
					System.out.print("0 ");
				
				}
			
				else
				{
				
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}

}
