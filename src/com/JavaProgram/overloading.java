package com.JavaProgram;

public class overloading {
	
	public void studentinfo(String name) {
		
		 name= "helen";
		 System.out.println(name);
	}
		
   public void studentinfo (String name1, String degree) {
	  
	   name1="helen";
	   degree="M.sc";
	   System.out.println(name1+ " " +degree);
   }
	
   public void studentinfo (String name2,String degree2,int yop ) {
	  
	  name2="helen" ;
	  degree2="M.sc";
	  yop=2021; 
	  System.out.println(name2+ " " +degree2+ " " +yop);
   }
	
   public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
	overloading ovld = new overloading();
			    ovld.studentinfo("helen");
				ovld.studentinfo("helen","M.sc");
	            ovld.studentinfo("helen","M.sc",2021);
   }
}


