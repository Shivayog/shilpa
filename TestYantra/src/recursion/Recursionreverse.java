package recursion;

public class Recursionreverse
{
public static void main(String[] args)
{
	int n=123;
	reverse(n) ;
}
public static void reverse(int n)
{
	if(n<=1)
	{
		return ;
	}
	else
	{
		 System.out.println(n%10);
		reverse(n/10);
	}
}
}



