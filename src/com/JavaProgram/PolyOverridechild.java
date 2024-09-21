package com.JavaProgram;


public class PolyOverridechild extends PolyOverride{
	
	public void carname() {
		System.out.println("BMW");
		this.locationpin();
	}
	
	@Override
	public void locationpin() {
		System.out.println("House location");
		super.locationpin();
		super.secretcode("123");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyOverridechild value=new PolyOverridechild();
		value.locationpin();
		value.carname();
	}
}