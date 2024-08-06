package com.geek.collections;

import java.util.ArrayList;

public class ArrayListDemoNonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add("Bangalore");
		System.out.println(list1);
		
		int x = (int)list1.get(0);
		String str = (String) list1.get(1);
		System.out.println(x);
		System.out.println(str);
		
		int y = (int)list1.get(1); // this will give error due to type mismatch. 
		
	}

}
