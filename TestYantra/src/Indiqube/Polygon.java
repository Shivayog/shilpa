package Indiqube;
import java.util.Scanner;
public class Polygon
{
	
	
	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the number");
		int s=Sc.nextInt();
		switch (s)
		{
			
		
		case 1:
				{
					circle();
				
				break;
				}
			case 2:
				{
					rectangle();
					break;
				}
			case 3:
				{
					square();
					break;
				}
			case 4:
				{
					triangle();
					break;
				}
		}
	}
	 public static void circle()
	 {
		 int a=5;
	     double pi=3.142;
	    double res=pi*a*a;
	    System.out.println(res);
	 }
	 public static void rectangle()
	 {
		 int b=5;
		 int h=10;
		 int res=b*h;
		 System.out.println(res);
	 }
	 public static void square()
	 {
		 int a=5;
		 int res=a*a;
		 System.out.println(res);
	 }
	 public static void triangle()
	 {
		 int a=5;
		 int b=10;
		
		 double res=(a*b)/2;
		 System.out.println(res);
	 
		
		
		
		
		
	}

}
