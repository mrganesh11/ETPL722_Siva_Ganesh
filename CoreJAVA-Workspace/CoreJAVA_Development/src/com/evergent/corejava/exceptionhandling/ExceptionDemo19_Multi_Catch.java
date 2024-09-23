package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo19_Multi_Catch {

	 String s="null";
	    int k=0;
		public void myData()
		{
			try
			{
			System.out.println("one");
			System.out.println(s.length());
			int d=10/k;
			System.out.println(d);
			System.out.println("end");
			}
			catch(ArithmeticException | NullPointerException e)
			{
				System.out.println("I can handle "+e);
			}
		}
		public static void main(String[] args) {
			
				ExceptionDemo19_Multi_Catch ed=new ExceptionDemo19_Multi_Catch();
				ed.myData();
				}
}
