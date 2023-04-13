package numberprogram;

import java.util.Scanner;

public class Sunnynumber 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();

       int a1=a+1;
      boolean flag=false;
       int sq=1;
      for(int i=1;i<=a1/2;i++)
      {
    	sq=i*i;
	if(a1==sq)
	{
		flag=true;
		break;
		
	}
}
if(flag==true)
{
	System.out.println("it is sunny num");
	}
else
{
	System.out.println("not a sunny num");
}

	
}

}
