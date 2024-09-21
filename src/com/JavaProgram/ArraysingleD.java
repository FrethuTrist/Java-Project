package com.JavaProgram;

public class ArraysingleD{
	
	public void Nonliteral() {
		
		//Syntax : Datatype VarName = New Datatype{length};
		
	int height[]=new int[4]	;
	
	height[0]=20;
	height[1]=30;
	height[3]=50;

	 
	 int c=0;
	 System.out.print("{");
		
	for(int value : height ) {
		System.out.print(value);
		if (c  < height.length-1) 
			System.out.print(",");
		c++;
		
		
	}
	System.out.println("}");
	
	}	
	
	public void literal() {
		
		// Syntax : Datatype VarName={values};
		
		String FamilyNames[]={"Helen","Karthick","Frethik"};
		
			
		
		System.out.print("[");
		for(int i=0;i<FamilyNames.length;i++) {
			System.out.print(FamilyNames[i]);
			if ( i < FamilyNames.length -1) 
				System.out.print(",");
			}
			
		
		System.out.print("]");
		


	}
	

	
	


	public static void main(String[] args) {
		  
		ArraysingleD heightcalc = new ArraysingleD();
		heightcalc.Nonliteral();
		heightcalc.literal();
		
		
	}
	   

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	