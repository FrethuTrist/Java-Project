package com.JavaProgram;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapjavaprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,String> colours=new TreeMap<Integer,String>();
		
		 colours.put(5, "pink")	;
		 colours.put(0, "voilet");
		 colours.put(2, "Red");
		 colours.put(3, "white");
		 colours.put(4, null);
		 colours.put(5, null);
		 
		 System.out.println(colours);
		 
		 int size = colours.size();
		System.out.println(size);

		String getvalue = colours.get(2);
		System.out.println(getvalue);


		Set<Integer> keySet = colours.keySet();
		System.out.println("KeySet" + keySet);		

		Collection<String> values = colours.values();
			System.out.println(values);	
			
			Set<Entry<Integer, String>> entrySet = colours.entrySet();
			System.out.println(entrySet);
	
	}

}
