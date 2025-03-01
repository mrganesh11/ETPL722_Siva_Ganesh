package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo6 {
	String name = "null";
	int k = 2;
	public void myData(){
		try {
			System.out.println("One");
			System.out.println(name.length());
			int t = 10/k;
			System.out.println(t);
			System.out.println("End");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle : "+e);
		}
		catch(ArithmeticException e) {
			System.out.println("I can handle : "+e);
		}
		catch(Exception e) {
			System.out.println("I can handle : "+e);
		}
		finally {
			System.out.println("Finally Block Close Connection");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo6 ed2 = new ExceptionDemo6();
		ed2.myData();
	}
}
