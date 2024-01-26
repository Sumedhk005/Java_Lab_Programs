import java.util.Scanner;
abstract class Bank
{
    abstract void getbalance();
}

class BankA extends Bank
{
       int A;
       void getbalance()
	     {
		     Scanner sc=new Scanner(System.in);
			 System.out.println("Enter the amount to deposite in Bank A");
			 A=sc.nextInt();
			 System.out.println("Bank A balance: "+A);
			 System.out.println();
		 }
}

class BankB extends Bank
{
        int B;
		void getbalance()
		  {
		     Scanner sc=new Scanner(System.in);
			 System.out.println("Enter the amount to deposite in Bank B");
			 B=sc.nextInt();
			 System.out.println("Bank B balance: "+B);
			 System.out.println();
		  }
}

class BankC extends Bank
{
        int C;
		void getbalance()
		  {
		     Scanner sc=new Scanner(System.in);
			 System.out.println("Enter the amount to deposite in Bank C");
			 C=sc.nextInt();
			 System.out.println("Bank C balance: "+C);
			 System.out.println();
		  }
		  	 
}

class test
{
	 public static void main(String ar[])
	 {
			 BankA b1=new BankA();
			 b1.getbalance();
			 BankB b2=new BankB();
			 b2.getbalance();
		     BankC b3=new BankC();
			 b3.getbalance();
	 }	 
}