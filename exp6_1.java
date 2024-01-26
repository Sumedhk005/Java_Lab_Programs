abstract class Demo
{
     Demo()
	 {
		 System.out.println("This is constructor of abstract class");
	 }
	 
	 abstract void  a_method();
	 
	 void normal()
	 {
		 System.out.println("This is the normal method of abstract class ");
	 }
	 
}

class Subclass extends Demo
{	
	void a_method()
	{
		System.out.println("This is abstract method ");
	}
	
	public static void main(String ar[])
	{
		Subclass s1=new Subclass();
		s1.a_method();
		s1.normal();
	}
}
