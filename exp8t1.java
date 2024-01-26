import java.util.Scanner;
class A
{
   public static void main(String ar[])
       {
	      Scanner sc=new Scanner(System.in);
		  System.out.print("Enter two values=");
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  try
		  {
		     int c=a/b;
			 System.out.println("Division : "+c);
		  }
		  catch(Exception e)
		  {
		     System.out.println("Exception occurs");
		  }
		  System.out.println("Hello Exception....");
	   }
}