package com.evergent.corejava.collections.queue;

import java.util.*;

public class Queue_LinkedList11 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Deque<String> q1=new LinkedList<>();
		q1.add("Banana");
		q1.addFirst("Pineapple");
		q1.add("Watermelon");
		q1.addLast("Papaya");
		q1.offerFirst("kiwi");
		q1.offer("Apple");
		q1.offerLast("Mango");
		System.out.println(q1);
		System.out.println(q1.size());
		boolean t=q1.isEmpty();
		System.out.println(t);
		q1.clear();
		System.out.println(q1);
	}
}
