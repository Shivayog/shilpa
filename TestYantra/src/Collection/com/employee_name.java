package Collection.com;
import java.util.Iterator;
import java.util.ArrayList;

public class employee_name
{
public static void main(String[] args) 
{
	ArrayList al=new ArrayList();
	al.add("shilpa");
	al.add("shweta");
	al.add("shiva");
	al.add("harshit");
	al.add("chinnu");
	Iterator itr=al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
}
}
