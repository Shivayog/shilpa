package pattern;
import java.util.Scanner;

public class Pattern_box
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
				System.out.print(" x  ");
			}
			System.out.println();
		}
	}

}
