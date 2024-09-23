package com.evergent.corejava.ram.application3;

public class EmployeeInformation extends BankAccountDetails implements EmployeeInterface{
	int eno;
	double sal;
	String address;
	//Interface override methods
	public void employeeInfo(int eno,float sal)
	{
		this.eno=eno;
		this.sal=sal;
	}
	public void employeeAddress(String address)
	{
		this.address=address;
	}
	public void employeeDetails()
	{
		System.out.println("Employee number :"+eno);
		System.out.println("Employee sal :"+sal);
		System.out.println("Employee address :"+address);
	}
	//abstract class implementation
	public void accountDetails()
	{
		System.out.println("My account details is : 1234567890");
	}
	public void show()
	{
		System.out.println("This is show local method");
	}
	public static void main(String[] args) {
		// Interface method calling
		EmployeeInformation emp=new EmployeeInformation();
		emp.employeeInfo(100,5000);
		emp.employeeAddress("Banglore");
		emp.employeeDetails();
		//Abstract class methods
		emp.accountDetails();
		emp.bankDetails();
		BankRBI rbi=new BankRBI();
		BankRBI rbi1=new BankRBI(3.3,3.3);
		BankRBI.getbankDetails();
		//calling local methods 
		emp.show();
	}

}
