package recursion;

public class Recursioncount 
{
	 static int n1=0;
	public static int count(int n)
	{
         if(n<=1)
          {
	        return n1;
          }
          else
         {
	       n1++;
	       return count (n-1);
         }
    }
public static void main(String[] args)
{
	int n=25;
	System.out.println(count(n));
}

}

