package com.evergent.corejava.collections;

import java.util.ArrayList;

public class CF12_ArrayList_forEachObject {

	public static void main(String[] args) {
		ArrayList<Object> myList=new ArrayList<>();
		myList.add(100);
		myList.add("venky");
		myList.add("pavan");
		myList.add(55.8);
		for(Object o:myList) {
			System.out.println(o);
		}

	}

}
