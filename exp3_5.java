class Fib 
{
    public static void main(String ar[])
	   {
	      int n1=0;
		  int n2=1;
		  int n3,i;
		  int count=12;
		  
		   System.out.println(" "+n1);
		   System.out.println(" "+n2);
		   
		     for(i=2;i<count;i++)
			    {
				  n3=n1+n2;
				  System.out.println(" "+n3);
				  
				  n1=n2;
				  n2=n3;
				}
	   }
}