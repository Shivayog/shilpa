package recursion;

public class Recursionproduct
{
public static void main(String[] args)
{
	int n=5;
	int p=1;
	System.out.println("the produuct of natural number is "+sum(n));
}
private static int sum(int n)
{	

if(n<=1)
{

return n;
}
else
{
	return(n*sum(n-1));
}
}
}
