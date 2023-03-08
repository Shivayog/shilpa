package Indiqube;

//import java.util.Scanner;

public class CharArray
{
public static void main(String[] args)
{
	char[]ch= {'G','A','G','D','A','G'};
	int i=0;
	int j=ch.length-1;
	boolean flag=false;
	while(i<j)
	{
		if(ch[i]!=ch[j])
			flag=false;
		i++;
		j--;
	}
	if(flag==false)
	{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}

