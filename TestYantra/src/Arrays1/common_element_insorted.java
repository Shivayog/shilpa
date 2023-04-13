package Arrays1;

public class common_element_insorted
{
public static void main(String[] args) 
{
 int	a[]= {1,2,3,9,8};
 int	b[]= {1,2,3,4,5,7,9};
 int	c[]= {3,2,3,9,5};
 
 commonelement(a,b,c);
}

public static void commonelement(int[] a, int[] b, int[] c) {
	int x=0;
	int y=0;
	int z=0;
	while(x<a.length && y<b.length && z<c.length)
	{
		if(a[x]==b[y]&&b[y]==c[z])
		{
			System.out.println(a[x]);
			x++;
			y++;
			z++;
		}
		else if(a[x]>b[y])
		{
			y++;
		}
		else if(b[y]>c[z])
				{
			      z++;
				}
		else
		{
			x++;
		}
	}
	
}
}
