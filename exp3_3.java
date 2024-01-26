import java.util.Scanner;
class Age 
{
    public static void main(String ar[])
	  {
	    int num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		num=sc.nextInt();
		
		if(num>18)
		  {
		    System.out.println("Eligible for voting");
		  }
		else
          {
		    System.out.println("Not eligible for voting");
		  }		
	  }
}