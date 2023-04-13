package Indiqube;

public class buble {
public static void main(String[] args) {
	int[]a= {1,3,6,8,2};
	
	for(int i=0;i<a.length;i++)
	{
		for (int j = i+1; j < a.length-1; j++) {
			
			if(a[j]>a[i])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
		}
	}
	for (int j= 0; j < a.length; j++) {
		
	
	System.out.println(a[j]);
	
	
	
}
}
}