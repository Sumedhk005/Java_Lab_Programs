import java.sql.*;
import java.util.Scanner;
class A
{
   void chk()throws SQLException
     {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter age=");
		int age=sc.nextInt();
		if(age<18)throw new SQLException();
	 }
}

class demo
{
     public static void main(String ar[])
	 {
		 A a1=new A();
		 try
		 {
			 a1.chk();
		 }
		 catch(Exception e)
		 {
			 System.out.println("Invalid ");
		 }
		 System.out.println("Hello");
	 }	 
}