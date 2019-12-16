package org.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class Set {
	private static User3 e1;

	public static void main(String[] args) {
		Map<Integer,User3> l=new HashMap();
		
		User3 e=new User3();
		e.setId(6473);
		e.setName("sakthi");
		e.setPhno(8883777062l);
		
		//2 employee details
		User3 e1=new User3();
		e1.setId(79374973);
		e1.setName("gd");
		e1.equals(738273273l);
		l.put(1, e);
		l.put(2, e1);
		  java.util.Set<Entry<Integer, User3>> u = l.entrySet();
		for (Entry<Integer, User3> w : u) {
			System.out.println(w.getKey());
			System.out.println(w.getValue().getId());
			System.out.println(w.getValue().getName());
			System.out.println(w.getValue().getPhno());
			
		}
			
			
		}
		
		
		
	}


