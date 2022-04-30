package com.java.org;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collection_Concept {
	public static void main(String[] args) {
TreeSet al = new TreeSet<>();
		
		al.add("prithiv");
		al.add("pavi");
		al.add("niru");
		
		al.add("pavi");
		System.out.println(al);
		
		for (Object string : al) {
			System.out.println(string);
		}
		
		
		HashMap obj = new HashMap();
		obj.put(obj, al);
		System.out.println(obj);
		Map<Integer, String>ob = new HashMap<>();
		String put = ob.put(1, "pavi");
		System.out.println(put);;
		boolean containsKey = ob.containsKey("pavi");
		System.out.println(containsKey);
		Collection<String> values = ob.values();
		System.out.println(values);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static ListIterator<Object> ListIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
