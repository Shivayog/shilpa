package Test;

public class frequency 
{
public static void main(String[] args)
{
	String s="java";
	
	String s1=" ";
	for(int i=0;i<s.length();i++)
	{ 
		int count=1;
		char c=s.charAt(i);
		if(s1.indexOf(c)==-1)
		{
		for(int j=i+1;j<s.length();j++)
		{
			
			    if(c==s.charAt(j))
		    	{
				count++;
				
			    }
		}
		
		System.out.print(c+""+count);
     	s1+=c;
            

	}	
	
}
}


}

