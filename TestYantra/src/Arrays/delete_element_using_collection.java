package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class delete_element_using_collection 
{
	public static void main(String[] args) 
	{
		String []sArray= {"hi","hello","goodmorning"};
		 List<String> stringList= new ArrayList(Arrays.asList(sArray));
//		 stringList.remove(1);
		 stringList.remove("goodmorning");
		 System.out.println(stringList);
	}

}
