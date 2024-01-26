import java.util.Scanner;
class Box
{
    int ln,br,ht;
	
	Box(int l,int b,int h) 
	{
	   ln=l;
	   br=b;
	   ht=h;
	}
	
	void volume()
	{
	   int vl=(ln*br*ht);
	   System.out.println("Volume="+vl);
	}
	
	public static void main(String ar[])
	{
	   	int a,b,c,d,e,f;

	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the value of length,breadth and height");
	   a=sc.nextInt();
	   b=sc.nextInt();
	   c=sc.nextInt();
	   Box b1=new Box(a,b,c);
	   b1.volume();
	   
	   System.out.println("Enter the value of length,breadth and height");
	   d=sc.nextInt();
	   e=sc.nextInt();
	   f=sc.nextInt();
	   Box b2=new Box(d,e,f);
	   b2.volume();
	}
}