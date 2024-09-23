package com.evergent.corejava.collections;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
public class CF14_ArrayList_HashSet {

	public static void main(String[] args) {
		//creation of arraylist
		List<String> list=new ArrayList<String>();
		list.add("CoreJAVA");
		list.add("J2EE");
		list.add("J2EE");
		list.add("MyJAVA");
		System.out.println(list);
		//creation of hashset
		Set<String> s=new HashSet<String>();
		s.addAll(list);
		Set<String> s1=new HashSet<String>();
		//adding elements in set
		s1.add("CoreJAVA");
		s1.add("J2EE");
		s1.add("J2EE");
		s1.add("MyJAVA");
		s1.add("CoreJAVA");
		if(s.equals(s1)) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
		System.out.println(s.containsAll(s1));

	}

}