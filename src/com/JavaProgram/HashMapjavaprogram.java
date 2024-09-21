package com.JavaProgram;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapjavaprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> colours=new HashMap<Integer,String>();
		
 colours.put(1, "pink")	;
 colours.put(0, "voilet");
 colours.put(2, "Red");
 colours.put(3, "white");
 colours.put(null, null);
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
