import java.util.Scanner;
class AgeException extends Exception
{
    AgeException(String str)
	{
      super(str);
	} 
}

class A 
{
     void chk()throws AgeException
	   {
		 Scanner sc=new Scanner(System.in);
         System.out.print("Enter age:");
         int age=sc.nextInt();
         if(age<18)throw new AgeException("Invalid");
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
			System.out.println("Exception occurs");
		}
		System.out.println("Hello.....");
	}
}