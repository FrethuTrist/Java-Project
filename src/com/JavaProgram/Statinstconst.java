package com.JavaProgram;

public class Statinstconst extends Statinstconst2{

	
	static {
		System.out.println("Grandfather");
	}
	
	{
		System.out.println("Father");
	}

	Statinstconst(){
		System.out.println("Child");
	}
	
	void a1() {
		System.out.println("Family");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statinstconst z=new Statinstconst();
		z.a1();
		z.a2();
	}
}

 class Statinstconst2{
	 
	 static {
			System.out.println("Grandmother");
		}
		
		{
			System.out.println("Mother");
		}

		Statinstconst2(){
			System.out.println("Children");
		}
		
		void a2() {
			System.out.println("Families");
		} 
		
 }
	

 class Statinstconst3{
	 
	 static {
			System.out.println("Grandmother3");
		}
		
		{
			System.out.println("Mother3");
		}

		Statinstconst3(){
			System.out.println("Children3");
		}
		
		void a3() {
			System.out.println("Families3");
		} 
		
 }
 
 