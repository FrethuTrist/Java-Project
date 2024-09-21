package com.JavaProgram;

public class Conditionnestedifelse {
	
	public void nestedifelse() {
	 
		String name = "Helen";
		String name2="Karthick";

		if((name==name2) && (name==name)) {
		
			System.out.println("Success 1");
			
			if((name==name2) || (name==name)) {
				
				System.out.println("Success 2");
				
			}
			else
				System.out.println("Failure");
		
		}
		else 
			System.out.println("Program Failure");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conditionnestedifelse value=new Conditionnestedifelse();
		value. nestedifelse();
		
	}

}
