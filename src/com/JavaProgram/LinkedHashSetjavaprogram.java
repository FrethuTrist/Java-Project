package com.JavaProgram;

import java.util.LinkedHashSet;

public class LinkedHashSetjavaprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
LinkedHashSet<String> days=new LinkedHashSet<String>();
		
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Thursday");
		days.add(null);
		days.add(null);
		
		System.out.println(days);
		
			int size=days.size();
			System.out.println("size is"+ " " + size);
			
		boolean removevalue = days.remove(3);
				System.out.println(" Remove Value is"+" " + removevalue);
	
				days.retainAll(days);
				System.out.println(days);
				
				days.addAll(days);
				System.out.println(days);
				
				days.clear();
				System.out.println(days);
				
				boolean removeAll = days.removeAll(days);
				System.out.println("The value is"+ " "+ removeAll);	

	}

}
