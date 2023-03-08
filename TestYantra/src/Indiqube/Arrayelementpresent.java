package Indiqube;

import java.util.Scanner;

public class Arrayelementpresent 
{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in );
System.out.println("enter the size ");
int size=Sc.nextInt();

boolean flag=true;
int [] d=new int[size];
System.out.println("Enter the array element ");
for(int i=0; i<size ;i++)
{
d[i]=Sc.nextInt();
}
System.out.println("Enter the element ");
int ele=Sc.nextInt();
for(int i=0; i<size; i++)
{
if(ele==d[i])
{
flag=false;
break;
}

}
if(flag==true)
{
System.out.println(ele+ " not present " );
}
else
{
System.out.println(ele +"   is present ");
}
}
}
