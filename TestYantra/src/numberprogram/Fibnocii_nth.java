package numberprogram;

public class Fibnocii_nth 
{
public static void main(String[] args) 
{
	int n=5;
	int a=0;
	int b=1;
	int c=0;
	System.out.print(a+" "+b+" ");
	for(int i=0;i<n;i++)
	{
		c=a+b;
		a=b;
		b=c;
		System.out.println(c+" ");
	}
}
}
