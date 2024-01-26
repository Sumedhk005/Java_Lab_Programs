import java.util.Scanner;
class person
{
     int age;
	 String name;
	 person()
	   {
	      Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Name");
		  name=sc.next();
		  System.out.println("Enter Age");
		  age=sc.nextInt();
	   }
	 public static void main(String ar[])
        {
		   emp e1=new emp();
		   e1.display();
		   System.out.println();
		   emp e2=new emp();
		   e2.display();
		   System.out.println();
		   
		   student s1=new student();
		   student s2=new student();
		}	 
}

class student extends person
{
	int m1,m2,m3,rn;
	 student()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter roll no");
		 rn=sc.nextInt();
		 
		 System.out.println("Enter marks for 3 subjects");
		 m1=sc.nextInt();
		 m2=sc.nextInt();
		 m3=sc.nextInt();
		 
		 int avg=(m1+m2+m3)/3;
		 System.out.println();
		 System.out.println("Name:"+name );
		 System.out.println("Age:"+age);
		 System.out.println("Roll no:"+rn);
		 System.out.println("Average="+avg);
		 
		 if(avg>=80 && avg<100)
		 {
			 System.out.println("A Grade");
		 }
		 else if(avg>=60 && avg<80)
		 {
			 System.out.println("B Grade");
		 }	 
		 else if(avg>=40 && avg<60)
		 {
			 System.out.println("C Grade");
		 }	 
		 else
		 {
			 System.out.println("Fail");
		 }	
          System.out.println();		 
	 }
	 
}

class emp extends person
{
     int salary,id;
      emp()
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter ID and Salary");
		  id=sc.nextInt();
		  salary=sc.nextInt();
	  }	  
	  
	  void display()
	  {
		  System.out.println();
		  System.out.println("Name:"+name);
		  System.out.println("ID:"+id);
		  System.out.println("Age:"+age);
		  System.out.println("Salary:"+salary);
	  }
}