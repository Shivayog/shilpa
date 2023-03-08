package Indiqube;
import java.util.Scanner;

public class Pattern1 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the rows");
	int rows=sc.nextInt();
	System.out.println("enter the col");
	int col=sc.nextInt();
			
	for(int r=1;r<=4;r++)
		
	{
		for(int c=1;c<=4;c++)
		{
			if(r==1 || r==rows|| c==1||c==col)
			{
			System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
