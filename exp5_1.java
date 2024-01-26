import java.util.Scanner;
class Person
{
   int id;
      Person()
	    {
		    Scanner sc=new Scanner(System.in);
			System.out.println("Enter id");
			id=sc.nextInt();
		}
}

class emp extends Person 
{
    String name;
	int salary;
	emp()
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter name and salary");

        name=sc.next();
        salary=sc.nextInt();			  
	}
	
	
	void display()
	{
	    System.out.println();
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);
        System.out.println("Salary:"+salary);		
	}
	
	public static void main(String ar[])
	{
	    emp e1=new emp();
		e1.display();
		System.out.println();
		emp e2=new emp();
		e2.display();
		System.out.println();
		emp e3=new emp();
		e3.display();
	}
}