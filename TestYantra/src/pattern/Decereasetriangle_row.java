package pattern;

public class Decereasetriangle_row
{
public static void main(String[] args)
{
	for(int r=5;r>=1;r--)
	{
		for(int c=1;c<=r;c++)
		{
			System.out.print(r+" ");
		}
		System.out.println();
	}
}
}
