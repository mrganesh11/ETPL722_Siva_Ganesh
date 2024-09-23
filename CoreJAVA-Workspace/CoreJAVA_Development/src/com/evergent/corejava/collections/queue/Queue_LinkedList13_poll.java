package com.evergent.corejava.collections.queue;
import java.util.Deque;
import java.util.LinkedList;

public class Queue_LinkedList13_poll {

	public static void main(String[] args) {
		Deque<String> ad = new LinkedList<>();
		ad.add("Banana");
		ad.addFirst("PineApple");
		ad.add("Watermelon");
		ad.addLast("papaya");
		ad.offerFirst("Kiwi");
		ad.offerLast("Mango");
		System.out.println(ad);
		System.out.println(ad.peek());
		System.out.println(ad.peekLast());
		System.out.println(ad.peekFirst());

	}

}

