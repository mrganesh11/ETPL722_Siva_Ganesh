package com.evergent.corejava.studentapplication;
public class StudentService {
	                           //100      corejava    250
	public int addStudentService(int sId,String sname,float marks)
	{  String grade="";
	
	   if(marks>=30 && marks<=50)
	   {
		   grade = "C";
	   }
	   else if(marks>=51 && marks<=75)
	   {
		   grade = "B";
		   
	   }
	   else
	   {
		   grade = "A";
	   }
		
		
		StudentDAO bookDAO = new StudentDAO();
		StudentBean bookBean=new StudentBean();
	       bookBean.setsId(sId);	
	       bookBean.setSname(sname);
	       bookBean.setMarks(marks);
	       bookBean.setGrade(grade);
	
		   int updateResult= bookDAO.addBook(bookBean);
		
		return 1;
	} 
}
