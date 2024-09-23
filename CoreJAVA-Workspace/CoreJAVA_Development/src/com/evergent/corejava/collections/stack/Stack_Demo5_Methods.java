package com.evergent.corejava.collections.stack;

import java.util.Stack;

public class Stack_Demo5_Methods {

	public static void main(String[] args) {
		Stack myStack=new Stack();
		myStack.push("red");
		myStack.push("black");
		myStack.push("white");
		System.out.println("stack is:"+myStack);
		//peeking an element from the stack
		String removeElement=(String) myStack.pop();
		System.out.println("popped element:"+removeElement);
		//dispalying the stack after popping
		System.out.println("Stack after pop:"+myStack);
		//checking the stack is empty or not
		boolean isEmpty=myStack.isEmpty();
		System.out.println("is the stack is empty:"+isEmpty);
		//searching for an element
		int position=myStack.search("black");
		System.out.println("position of black from top"+position);
		//clearing the stack
		myStack.clear();
		System.out.println("stack after clearing:"+myStack);
		
		


	}

}