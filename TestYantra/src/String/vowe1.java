package String;

import java.util.Scanner;

public class vowe1 
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("Enter a string: ");
	String s=Sc.nextLine();
	int count=0;
	/*char r=s.charAt(0);
	if(r == 'a' || r == 'e' ||r == 'i'|| r == 'o' || r == 'u') count++;
	
	for(int i = 1; i < s.length(); i++) {
     	char ch=s.charAt(i);
     	if(ch==' ')	     		
     	{
     		char c1=s.charAt(i+1);
     	if(c1 == 'a' || c1 == 'e' ||c1 == 'i'|| c1 == 'o' || c1 == 'u')
     	{
        	count++;
        	
        }
	}
	
}
//	System.out.println(count);*/
//	count the vowels
	
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			
			if(i==0&&ch!=' ' ||s.charAt(i)!=' ' && s.charAt(i-1)==' ')
			{

			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			 {
			 	count++;
			 }
		   }
		}
		System.out.println(count);
}

}

