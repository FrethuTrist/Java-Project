package com.JavaProgram;

public class Inheritancemobilephone extends Inheritancenetwork{
	
	
	public void samsung() {
		System.out.println("Quality");
			
	}
	
	public void realme() {
		System.out.println("Camera quality");
		
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

	Inheritancemobilephone value=new Inheritancemobilephone();
	value.samsung();
	value.realme();
	value.jio();
	value.airtel();
	}

}
