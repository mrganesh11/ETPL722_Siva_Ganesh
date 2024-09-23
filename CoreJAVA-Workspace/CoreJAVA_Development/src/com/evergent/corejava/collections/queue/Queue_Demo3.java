package com.evergent.corejava.collections.queue;

import java.util.PriorityQueue;

public class Queue_Demo3 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(8);
		pq.offer(2);
		pq.add(5);
		pq.add(9);
		System.out.println(pq);
		pq.clear();
		System.out.println(pq.poll());

	}

}