package numberprogram;

public class avg 
{
public static void main(String[] args) 
{
int avg;
//	double avg;
	int sum=0;
//	double sum=0.0;
	int count=0;
//	double count=0.0;
	for(int i=10;i<=20;i++)
	{
		sum=sum+i;
		count++;
	}
	avg=sum/count;
	
	System.out.println(avg);
}
}
