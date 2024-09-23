package com.evergent.corejava.ram.application3;

public class BankRBI {
	static
	{
		System.out.println("Welcome to employee details");
	}
	public BankRBI()
	{
		System.out.println("RBI bank home loan and personal loan interest");
	}
	public BankRBI(double p,double r)
	{
		System.out.println(p*r/100);
	}
	public static final void getbankDetails()
	{
		System.out.println("Home loan interest in 8.5");
		System.out.println("Personal loan interest is 11%");
	}
}
