package com.evergent.corejava.multithreading;

class MyClass1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
		}
	}
}
public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass1 t1=new MyClass1();
		t1.start();
		MyClass1 t2=new MyClass1();
		t2.start();
	}

}