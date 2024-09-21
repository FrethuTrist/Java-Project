package com.JavaProgram;

public class Interfacejavaprogram2 implements Interfacejavaprogram {
	
	
	
    @Override
	public void sunday() {
		// TODO Auto-generated method stub
		System.out.println("Sunday is holiday");
	}

	@Override
	public void montosat() {
		// TODO Auto-generated method stub
		System.out.println("Mon to friday working day");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfacejavaprogram2 inter=new Interfacejavaprogram2();
		inter.sunday();
		inter.montosat();
		
		
	}

}
