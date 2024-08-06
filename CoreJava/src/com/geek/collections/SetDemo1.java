package com.geek.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * HashSet -  no duplicates => return type of add() is boolean. 
		 * cannot guaranty order.
		 */

		HashSet<String> set1 = new HashSet<>();
		
		set1.add("Bangalore");
		boolean b1 = set1.add("Mysore");
		set1.add("Chennai");
		set1.add("Mumbai");
		set1.add("Pune");
		
		boolean b2 = set1.add("Mysore"); // returns False
		System.out.println(set1);
		
		System.out.println(b1+ " " +b2);
		
		// TreeSet -  no duplicates, elements are sorted by default.
		
		TreeSet<String> tset1 = new TreeSet<>();
		
		tset1.add("Bangalore");
		boolean bb1 = tset1.add("Mysore");
		tset1.add("Chennai");
		tset1.add("Mumbai");
		tset1.add("Pune");
		
		boolean bb2 = tset1.add("Mysore");
		System.out.println(tset1);
		
		System.out.println(bb1+ " " +bb2);
		
		// LinkedHashSet -  no duplicates, elements are arranged in insertion order.
		
		LinkedHashSet<String> lset1 = new LinkedHashSet<>();
				
		lset1.add("Bangalore");
		boolean lb1 = lset1.add("Mysore");
		lset1.add("Chennai");
		lset1.add("Mumbai");
		lset1.add("Pune");
				
		boolean lb2 = lset1.add("Mysore");
		System.out.println(lset1);
				
		System.out.println(lb1+ " " +lb2);
	}

}
