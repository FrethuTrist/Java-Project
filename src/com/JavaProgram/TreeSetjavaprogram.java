package com.JavaProgram;

import java.util.TreeSet;

public class TreeSetjavaprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

TreeSet<String> months=new TreeSet<String>();
		
months.add("January");
months.add("february");
months.add("March");
months.add("April");
months.add("May");
		
		System.out.println(months);
		
			int size=months.size();
			System.out.println("size is"+ " " + size);
			
//		boolean removevalue = months.remove(3);
//				System.out.println(" Remove Value is"+" " + removevalue);
//	
				months.retainAll(months);
				System.out.println(months);
				
				months.addAll(months);
				System.out.println(months);
				
				months.clear();
				System.out.println(months);
				
				boolean removeAll = months.removeAll(months);
				System.out.println("The value is"+ " "+ removeAll);	

	}

}
	
		
		
		
		
		
		
		