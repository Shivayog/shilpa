package String;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=" hello   world  j ";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if((i==0 && s.charAt(i)!=' ')||(s.charAt(i)!=' ' && s.charAt(i-1)==' '))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
