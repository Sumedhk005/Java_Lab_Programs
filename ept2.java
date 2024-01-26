import java.sql.*;
class A
{
    static int age=17;
	static void chk()throws SQLException
	   {
	       if(age<18)throw new SQLException();
	   }
}

class demo
{
    public static void main(String ar[])
	   {
	      try
		  {
			  A A1=new A();
		      A1.chk();
		  }
		  catch(Exception e)
		  {
		      System.out.println("Invalid age");
		  }
		  
		  System.out.println("Hello");
	   }
}