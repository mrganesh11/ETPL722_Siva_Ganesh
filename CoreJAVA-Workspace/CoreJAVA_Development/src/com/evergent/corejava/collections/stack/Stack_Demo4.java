package com.evergent.corejava.collections.stack;

import java.util.Stack;

public class Stack_Demo4 {

	public static void main(String[] args) {
		Stack myStack=new Stack();
		myStack.push("red");
		myStack.push("black");
		myStack.push("white");
		System.out.println(myStack);
		myStack.clear();
		boolean b=myStack.isEmpty();
		System.out.println(b);
		System.out.println(myStack);


	}

}
