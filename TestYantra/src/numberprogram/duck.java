package numberprogram;

import java.util.Scanner;

public class duck
{
public static void main(String[] args) 
{
	int n,temp;
	 boolean flag=false;

	Scanner Sc=new Scanner(System.in);

	System.out.println("enter the number");
	
	 n = Sc.nextInt();
    temp = n;
    while (temp > 0)
    {
      int  r = temp % 10;
        if(r==0)
        {
            flag=true;
        }
        temp = temp / 10;
    }
    if(flag)
    {
        System.out.println("Duck Number");
    }
    else
    {
        System.out.println("Not Duck Number");
}
}
}

