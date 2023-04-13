package numberprogram;

public class ntopowerp 
{
public static void main(String[] args) 
{
	int base=3;
	int exponent=3;
	int p=1;
	while(exponent!=0)
	{
		p=p*base;
		exponent--;
	}
	System.out.println(p);
}
}
