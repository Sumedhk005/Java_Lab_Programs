import java.util.Scanner;
class Select
{
   public static void main(String ar[])
      {
	    int a,b,c,ch;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter choice 1.Addition 2.Substraction 3.Multiplication 4.Division");
		ch=sc.nextInt();
		
		switch(ch)
		{
		    case 1:c=a+b;
                   System.out.println("Addition is:"+c);
                   break;
            case 2:c=a-b;
                   System.out.println("Substraction is:"+c);
				   break;
            case 3:c=a*b;
                   System.out.println("Multiplication is:"+c);
                   break;
            case 4:c=a/b;
                   System.out.println("Division is:"+c);
                   break;
            default:
                   System.out.println("Invalid");			
			
		}
	  }
}