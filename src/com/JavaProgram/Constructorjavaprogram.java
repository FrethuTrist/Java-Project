package com.JavaProgram;

public class Constructorjavaprogram {
	
	public void constypes() {
		
		System.out.println("I am non para cons");
		
	}
	
	public Constructorjavaprogram () {// non para or default or no argument
		this(null,0);
		System.out.println("which cons you are");
		
	}
	
	public Constructorjavaprogram (String name) {
		name="I am para cons";
		System.out.println(name);
		
	}
	
	public Constructorjavaprogram (String name,int value) {
		name="I am para cons";
		value=0;
		System.out.println(name+value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructorjavaprogram c=new Constructorjavaprogram();
		c.constypes();
		Constructorjavaprogram d=new Constructorjavaprogram (null);
		Constructorjavaprogram  e=new Constructorjavaprogram (null,0);
		
	}

}
