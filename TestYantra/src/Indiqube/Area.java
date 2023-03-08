package Indiqube;

import java.util.Scanner;
class area 
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner (System.in);
          double area,circumference;
          System.out.println(" enter the radius");
          double  r= sc.nextDouble();
          area=3.142*r*r;
          circumference=2.*3.142*r;
          System.out.println("area="+area);
          System.out.println("circumference="+circumference);
      }
}