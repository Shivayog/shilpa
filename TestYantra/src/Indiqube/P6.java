package Indiqube;
import java.util.Scanner;
public class P6
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the num");
	int n=Sc.nextInt();
	for( int r=n;r>=1;r--)
	{
		for(int c=n;c>=r;c--)
		{
			System.out.print(r+"  ");
		}
	

		System.out.println( );
	}
}
}
