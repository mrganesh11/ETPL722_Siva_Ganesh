package com.evergent.corejava.collections.stack;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
public class StackDemo_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> mystack=new Stack<>();
		mystack.push("Red");
		mystack.push("Black");
		mystack.push("White");
		System.out.println(mystack);
		System.out.println("Enumeration Iteration...");
		Enumeration e=mystack.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println("Iterator");
		Iterator i1=mystack.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("forEach Adv loop");
		for(String s:mystack)
		{
			System.out.println(s);
		}
	}

}
