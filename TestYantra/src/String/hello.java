package String;

import java.util.Scanner;

public class hello 
{
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=Sc.next();
		char []c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int count=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j] && c[j]!=' ')
				{
					count++;
					c[j]=' ';
				}
			}
			if(c[i]!=' ') {
				System.out.print(c[i]+""+count);
		}
		}
	}

		
	
	}


