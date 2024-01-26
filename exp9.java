class demo
  {
     public static void main(String ar[])
	     {
		     String str="Pvpit Budhgaon Sangli";
			 String str1="PVPIT";
			 String str2="pvpit";
			 
			 System.out.println(str);
			 System.out.println("Method 1:");
			 System.out.println(str.charAt(3));
			 System.out.println();
			 
			 System.out.println("Method 2:Length of string");
			 System.out.println(str.length());
			 System.out.println();
			 
			 System.out.println("Method 3:Sub string");
			 System.out.println(str.substring(4,9));
			 System.out.println();
			 
			 System.out.println("Method 4:contains");
			 System.out.println(str.contains("t"));
			 System.out.println();
			 
			 System.out.println("Method 5:toLowerCase and toUpperCase");
			 System.out.println(str.toLowerCase());
			 System.out.println(str.toUpperCase());
			 System.out.println();
			 
			 System.out.println("Method 6:equals");
			 System.out.println(str1.equals(str2));
			 System.out.println();
			 
			 System.out.println("Method 7:isEmpty");
			 System.out.println(str.isEmpty());
			 System.out.println();
			 
			 System.out.println("Method 8:concat");
			 System.out.println(str1.concat(str2));
			 System.out.println();
			 
			 System.out.println("Method 9:replace");
			 System.out.println(str.replace("p","a"));
			 System.out.println(str.replace("it","ab"));
			 System.out.println();
			 
			 System.out.println("Method 10:equalIgnoreCase");
			 System.out.println(str1.equalsIgnoreCase(str2));
			 System.out.println();
			 
			 System.out.println("Method 11:indexof");
			 System.out.println(str.indexOf("it"));
			 System.out.println();
			 
			 System.out.println("Method 12:join(Static method)");
			 System.out.println(String.join("-",str1,str2));
			 System.out.println();
		 }
  }