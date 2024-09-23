package com.evergent.corejava.studentapplication;

import java.util.ArrayList;

public class StudentDAO {
	
	                       //  100  corejava 250   c
	public int addBook(StudentBean sbean)
	{
		try{
			ArrayList bookList=new ArrayList();
			bookList.add(sbean.getsId());
			bookList.add(sbean.getSname());
			bookList.add(sbean.getMarks());
			bookList.add(sbean.getGrade());	
			
			System.out.println(bookList);
			
			System.out.println("Book ID :"+sbean.getsId());
			System.out.println("Book Title :"+sbean.getSname());
			System.out.println("Book Price :"+sbean.getMarks());
			System.out.println("Book Grade :"+sbean.getGrade());
			
			return 1;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}

}
