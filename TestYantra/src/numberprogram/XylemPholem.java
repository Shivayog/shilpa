package numberprogram;

import java.util.Scanner;

public class XylemPholem
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=Sc.nextInt();

		int sumfl=n%10;
		n/=10;
		int rest=0;
		while(n>9) 
		{
			rest+=n%10;
			n/=10;
		}
		sumfl+=n;
		System.out.println(sumfl);
		System.out.println(rest);
		
		if(sumfl==rest)
		{
			System.out.println("Xylem number");
		}
		else System.out.println("Phloem number");

	}



}


