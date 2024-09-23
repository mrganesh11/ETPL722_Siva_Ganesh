package com.evergent.corejava.studentapplication4;


public class StudentService {
    public int addStudentService(int studentId, String name, float gradePointAverage) {
        String grade = "";

        if (gradePointAverage >= 3.5) {
            grade = "A";
        } else if (gradePointAverage >= 2.5) {
            grade = "B";
        } else {
            grade = "C";
        }

        StudentDAO studentDAO = new StudentDAO();
        StudentBean studentBean = new StudentBean();
        studentBean.setStudentId(studentId);
        studentBean.setName(name);
        studentBean.setGradePointAverage(gradePointAverage);
        studentBean.setGrade(grade);

        int updateResult = studentDAO.addStudent(studentBean);

        return updateResult;
    }
}
