import java.util.Scanner;
class Rectangle
{
    int ln,br;
	
	void get()
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter value for Length and breadth");
	   ln=sc.nextInt();
	   br=sc.nextInt();
	}
	
	void area()
	{
	   int ar=ln*br;
	   System.out.println("Area="+ar);
	}
	
	public static void main(String ar[])
	{
	    Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		
		r1.get();
		r1.area();
		
		r2.get();
		r2.area();
	}
}