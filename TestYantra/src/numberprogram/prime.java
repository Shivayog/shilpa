package numberprogram;

public class prime 
{
public static void main(String[] args)
{
	int n=6;
	boolean flag=true;
	for(int i=0;i<=n;i++)
	{
		if(n%2==0)
		{
			flag=false;
			break;
		}
	}
	System.out.println(flag);
}
}
