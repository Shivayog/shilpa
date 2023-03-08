package Indiqube;

public class Mulmatrix
{
public static void main(String[] args) 
{
	int [][]a= {{1,1},{2,2}};
	int [][]b= {{1,1},{2,2}};
	int[][]c=new int[2][2];
// int 	p=1;
     for(int i=0;i<a.length;i++)
     {
    	for(int j=0;j<a[i].length;j++)
    	{ 
    		c[i][j]=0;
    		for(int k=0;k<a.length;k++)
    		c[i][j]=+a[i][k]*b[k][j];
    	
    		System.out.print(c[i][j]+" ");
    	}
    	System.out.println();
     }
	
}
}

