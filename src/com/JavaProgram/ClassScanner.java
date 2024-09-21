package com.JavaProgram;

import java.util.Scanner;

public class ClassScanner {
	
	public void Scan() {
		System.out.println("Enter the name : ");
		Scanner sc=new Scanner(System.in);
		String next = sc.next();
	           
		
		
		System.out.println("Enter the  mailaddress : ");
		Scanner sc1=new Scanner(System.in);
		String next2 = sc1.next();
		 
	if(0<10) {
		System.out.println("Condition is true it will execute");
		for (int i =0;i<=10;i++) {
			System.out.println(i);
		}
	}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		ClassScanner value= new ClassScanner();
		value.Scan();
		
	}

}


