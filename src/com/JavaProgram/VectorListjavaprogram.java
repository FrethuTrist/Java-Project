package com.JavaProgram;

import java.util.Vector;

public class VectorListjavaprogram {
	
Vector<String> names = new Vector<String>();
	
	
	public void method0() {
		
		names.add("Karthick");
		names.add("Helen");
		names.add("Frethik");
		names.add("Frethik");
		names.add(null);
		names.add(null);
		names.add(null);
		
		System.out.println(names);
		
	}
	
	public void method1() {
		
		int size=names.size();
		System.out.println("size is"+ " " + size);
	}
		
	public void method2() {	
		String getvalue = names.get(1);
		System.out.println("Tha Value is"+" " + getvalue);
	}
	
	public void method3() {
	
		String setvalue = names.set(2,"Tristan");
		System.out.println("Value is"+" " + setvalue);
	
	}
	public void method4() {
	
		String removevalue = names.remove(0);
		System.out.println(" Remove Value is"+" " + removevalue);
		
	}
	public void method5() {
	
		 int indexOf = names.indexOf("tristan");
			System.out.println("Indexof Value is"+" " + indexOf);
	
	}
	
	public void method6() {
	
		boolean contains = names.contains("Karthick");
		System.out.println("The contains  Value is"+" " + contains);
		
	}
	
	public void method7() {
	
		boolean addm = names.add("Jesus");
		System.out.println(" contains  Value is"+" " + addm);
		
	}
	
public void method8() {
		
		boolean retainAll = names.retainAll(names);
		System.out.println("Retain values are" + " " + retainAll);
	}
	
	public void method9() {
		
		boolean remove = names.remove("Helen");
		System.out.println(" contains  Value is"+" " + remove);
	}
	
public void method10() {
		
		names.clear();	
	}
	

public void method11() {
	
	boolean remove = names.removeAll(names);
	System.out.println(" contains  Value is"+" " + remove);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LinkedListjavaprogram  vl=new  LinkedListjavaprogram();
			
		 vl.method0();
		 vl.method1();
		 vl.method2();
		 vl.method3();
		 vl.method4();
		 vl.method5();
		 vl.method6();
		 vl.method7();
		 vl.method8();
		 vl.method9();
		 vl.method10();
		 vl.method11();
		
	}

}
