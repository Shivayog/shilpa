package Test;

public class strong
{
	public static void main(String[] args)
	{
	

int n=145;
int  sum=0;
int num=n;


	
	while(n>0) {
		int d=n%10;
		int fact=1;
	for(int i=1;i<=d;i++) {
		fact=fact*i;
	}
     sum+=fact;
     n/=10;
	}  
	if(sum==num)
	System.out.println("strong num");
	
	else 
		System.out.println("not strong num");
}



}

