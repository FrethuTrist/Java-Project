package com.JavaProgram;

public class Practiceliteandnonlite {
	
	
	public void Practice(){
		
		// literal : datatype varname = {values};
		
		String[] rupees= {"ten","twenty"};
		 
		System.out.print("{");
		
		int i=0;
		for(String Money : rupees) {
			System.out.print(Money);
			
			
			if(i<rupees.length-1)
				System.out.print(",");
			
				i++;
			
			
		}
			
		System.out.print("}\n");
	}
		
		public void apple() {
			
			// Non Literal  : Datatype varname=new datatype {length};
			
		int fruits[] ={1,2};
		 
		
		
		System.out.print("[");

		for(int i=0; i<fruits.length;i++) {
				System.out.print(fruits[i]);
				if(i<fruits.length-1);
					System.out.print(",");
	
		}
		System.out.print("]");
		}
		
	
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Practiceliteandnonlite  notes=new	Practiceliteandnonlite();
		notes. Practice();
		notes.apple();
		
	
	}

}
