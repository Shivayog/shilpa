package Indiqube;

public class Method1 
{
  public static int add (double a,double b)
{
//	add(20,40);
//	add(20.5,60.5);
//	add(50 ,60    );
//	add('A','C');
////	add("Hello","bye");

		
	return  (int)(a+b);	
}
  public static String add(String a,String b)
  {
	  return (a+b);  
  }
  public static void main(String[] args)
  {
	 
	  {
		System.out.println(add( 20,40 ));
		System.out.println(add( 20.5,60.5));
		System.out.println(add( 50,60 ));
		System.out.println(add( 'A','C' ));
		System.out.println(add( "hello","bye" ));
	}
	
	}

 

}

