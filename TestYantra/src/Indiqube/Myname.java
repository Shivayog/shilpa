package Indiqube;

import java.util.Scanner;

public class Myname
{
public static void main(String[] args) 
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=Sc.nextInt();
	for(int r=1;r<=n;r++)
	{
		for(int c=1;c<=n;c++)
		{
//			S print
//			if(r==1||r==3||r==5||(r==2&&c==1||r==4&&c==5))
//			L print
//			if(c==1||r==5)
//			I print
//			if(r==1||r==5|| (r==2&&c==3)||(r==3&&c==3)||(r==4&&c==3)||(r==5&&c==5))
//			J print
//			if(r==1||(r==2&&c==3)||(r==3&&c==3)||(r==4&&c==3)||(r==5&&c==3)||(r==5&&c==3)||(r==5&&c==2||(r==5&&c==1)||(r==4&&c==1)))
//			H print
//			if(c==1||c==5||(r==3&&c==2)||(r==3&&c==3)||(r==3&&c==4)||(r==3&&c==5))
//			P print
			if(r==1||c==1||(r==3&&c==2)||(r==3&&c==3)||(r==3&&c==4)||(r==3&&c==5)||(r==2&&c==5))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
		}
		
		System.out.println();
	}
}
}
