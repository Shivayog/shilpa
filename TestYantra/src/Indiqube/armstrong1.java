package Indiqube;

public class armstrong1 
{
public static void main(String[] args)
{
//	int n=371;
	int n=153;
	int temp=n;
	int r;
	int sum=0;
	while(n>0)
	{
		r=n%10;
		sum=sum+r*r*r;
		n=n/10;
		
	}
	if(temp==sum)
	{
		System.out.println("arm strong");
	}
	else
	{
		System.out.println("not arm strong");
	}
	
}
}
