package com.evergent.corejava.studentapplication;

import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		int sId=0;
		String sname="";
		float marks=0;
		
		Scanner sin=new Scanner(System.in);
		
		System.out.println("Enter Student ID");
		sId=sin.nextInt();
		System.out.println(("Enter Student Name"));
		sname = sin.next();
		System.out.println("Enter Student Marks");
		marks = sin.nextFloat();
		
		StudentService studentService = new StudentService();
		
		int updeateCount=studentService.addStudentService(sId,sname,marks);
		
		
		//last
		  System.out.println("Inserted :"+updeateCount+" record Ganesh Success");
		
		
		
		
	}

}
