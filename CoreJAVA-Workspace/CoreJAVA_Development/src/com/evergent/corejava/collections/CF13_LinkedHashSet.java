package com.evergent.corejava.collections;

import java.util.LinkedHashSet;

public class CF13_LinkedHashSet {

	public static void main(String[] args) {
		//elements are stored &retrieved in order they were added
		 LinkedHashSet<String> set=new LinkedHashSet<>();
		 //adding elements to linkedhashset
		 set.add("apple");
		 set.add("mango");
		 set.add("grapes");
		 set.add("banana");
		 System.out.println("linkedHashSet:"+set);
		 System.out.println("Iterating over linkedhashset");
		 //for-each loop
		 for(String fruit:set) {
			 System.out.println(fruit);
		 }
		 //contains() method given true, if that element is there in set
		 System.out.println("contains 'banana' "+set.contains("banana"));
		 //removing element from set
		 set.remove("mango");
		 System.out.println("after removing 'mango':"+set);
		 System.out.println("size of linked hash set:"+set.size());
		 set.clear();
		 System.out.println("after clearing:"+set);

	}

}