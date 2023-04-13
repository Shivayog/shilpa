package pattern;

public class hallow_sq_num 
{
public static void main(String[] args) 
{
	int n=1;
	for(int r=1;r<=4;r++)
	{
		for(int c=1;c<=4;c++)
		{
			if(r==1||r==4|| c==1||c==4)
			{
				System.out.print(r +" ");
			
			}
			else
			{
				System.out.print("  ");
			}
	
		}
			System.out.println();
		}
}
}
