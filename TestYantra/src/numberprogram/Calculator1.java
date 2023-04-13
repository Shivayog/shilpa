package numberprogram;

public class Calculator1 
{
public static void main(String[] args) 
{
	add();
	sub();
	pro();
	rem();
	div();
	dis();
}
public static void add()
{
int a=5;
int b=10;
int c=a+b;
System.out.println(c);
}

public static void sub()
{
	int a=5;
	int b=10;
	int c=a-b;
	System.out.println(c);
}
public static void pro()
{
	int a=5;
	int b=10;
	int c=a*b;
	System.out.println(c);
}
	 public static void rem()
	 {
		 int a=5;
		 int b=10;
		 int c=a%b;
		 System.out.println(c);
	 }
	 public static void div()
	 {
		 int a=20;
		 int b=10;
		 int c=a/b;
		 System.out.println(c);
	 }
	 public static void dis()
	 {
		 int a=50;
		 int b=10;
		 int c=a/b*100;
		 System.out.println(c);
}
}
