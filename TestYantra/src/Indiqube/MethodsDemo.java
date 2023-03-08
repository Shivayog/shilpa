package Indiqube;

public class MethodsDemo 
{
public static void main(String[] args) {
	 String  s="Software  Developer";
	 System.out.println(s.length());
	 
	 System.out.println("*************************");
	 
	 System.out.println(s.toUpperCase());
	 System.out.println("=============================");
	 
	 System.out.println(s.toLowerCase());
	 
	 System.out.println(s.startsWith("soft"));
	 System.out.println(s.startsWith(("Soft")));
	 
	 System.out.println("==================================");
	 
	 System.out.println(s.endsWith("per"));
	 System.out.println(s.endsWith("Per"));
	 
	 System.out.println("========================================");
	 
	 System.out.println(s.contains("dev"));
	 System.out.println(s.contains("Dev"));
	 
	 System.out.println("======================================");
	 
	 System.out.println(s.charAt(2));
	 System.out.println(s.charAt(10));
	 
	 System.out.println("***********************");
	 
	 System.out.println(s.indexOf('o'));
	 System.out.println(s.indexOf('e'));
	 
	 
	 System.out.println("===========================");
	 
	 String s1="java";
	 String s2="java";
	 String s3="JAVA";
	 System.out.println(s1.equals(s2));
	 System.out.println(s1.equals(s3));
	 
	 System.out.println("====================");
	 
	 System.out.println(s2.equalsIgnoreCase(s3));
	 
	 System.out.println("*******************");
	 String x="hello Lavanya";
	 
	 System.out.println(x.substring(3));
	 System.out.println(x.substring(3,8));
	 
	
}
}
