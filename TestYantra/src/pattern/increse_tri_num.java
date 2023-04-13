package pattern;
import java.util.Scanner;
public class increse_tri_num 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
      for(int r=n;r>=1;r--)
		
	{
		for(int c=n;c>=r;c--)
			
		{
			System.out.print(c+" ");
			
			}
		
		System.out.println();
		
}
}
}
