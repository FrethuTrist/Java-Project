package com.JavaProgram;

public class Conditionelseif {
	
	public void elseif() {
	
		String name = "Helen";
		String name2="Karthick";
	
		if(!((name==name2) && (! (name==name)))) {
			
			// True              // True = True
		
			System.out.println("Success 1");
		}
		else if(!((name==name2) || (! (name==name))))	 {
			    // True               // True  = True
			
			
			System.out.println("Success 2");
		}
		
		else
			System.out.println("Failure");
		
	}
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

	Conditionelseif value=new Conditionelseif();
	value.elseif();
	}

}
