package com.evergent.corejava.collections;

import java.util.LinkedList;

public class CF8_Linkedlist {

	public static void main(String[] args) {
		LinkedList mylist=new LinkedList();
		mylist.add("tata");
		mylist.add("bmw");
		mylist.add("xyz");
		mylist.addFirst("maruthi");
		mylist.addLast("safari");
		mylist.remove(4);
		System.out.println(mylist);
		mylist.clear();
		System.out.println(mylist);

	}

}