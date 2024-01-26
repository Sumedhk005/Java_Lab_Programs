class Nest
{
    public static void main(String ar[])
	   {
	      int a=12;
		  int b=44;
		  int c=33;
		  
		  if(a>=b)
		   {
		      if(a>=c)
			    {
				  System.out.println("a is greatest number");
				}
			  else
                {
				   System.out.println("c is greatest number");
				}			  
		   }
		   else if(b>=a)
		   {
		       if(b>=c)
			     {
				   System.out.println("b is greatest number");
				 }
				else
                  {
				    System.out.println("c is greatest number");
				  }				
		   }
	   }
}