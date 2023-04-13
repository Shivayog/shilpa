package String;

public class string
{
public static void main(String[] args)
{
	String s="java";
	System.out.println(s.toUpperCase());
	
	System.out.println("*************");
	
	
	System.out.println(s.toLowerCase());
	
	System.out.println("===============");
	
	String x="TEST YANTRA";
	System.out.println(x.toLowerCase());
	
	String x1="Test Program";
	System.out.println(x1.indexOf(5));
	System.out.println("============");
	
	String x3="    Program";
	System.out.println(x3.length());
	
	System.out.println("************");
	
	String x4="Yantra";
	System.out.println(x4.substring(1,5));
	
	System.out.println("============");
	String x5="Banglore";
	System.out.println(x5.contains("gal"));
	System.out.println("=================");
	
        String x6="Java Programs";
        System.out.println(x6.endsWith("Programs"));
        
        System.out.println("==========");
        
        String x7="Harison";
        System.out.println(x7.isEmpty());
}
}
