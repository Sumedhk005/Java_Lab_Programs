import java.util.Scanner;
class Get
{
   public static void main (String ar[])
       {
	     Scanner Sc=new Scanner (System.in);
		 System.out.println("Enter the value for A:");
		 int a=Sc.nextInt();
		 System.out.println("Enter the value for B:");
		 int b=Sc.nextInt();
		 int c=a+b;
		 System.out.println("Addition ="+c);
	   }
}