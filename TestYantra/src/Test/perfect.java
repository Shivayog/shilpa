package Test;

public class perfect 
{
public static void main(String[] args)
{

	
		int n=6;
        int sum=0;
       for(int i=1;i<n;i++) {
        if(n%i==0) {
        	sum+=i;
         }
        }
       if(sum==n) System.out.println("perfect num");
       else System.out.println("not perfect num");
	}


}

