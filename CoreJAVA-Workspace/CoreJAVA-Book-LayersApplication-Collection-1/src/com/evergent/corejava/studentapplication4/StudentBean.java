package com.evergent.corejava.studentapplication4;

import java.io.Serializable;

public class StudentBean implements Serializable {

    private int studentId;
    private String name;
    private float gradePointAverage;
    private String grade;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGradePointAverage() {
        return gradePointAverage;
    }

    public void setGradePointAverage(float gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", GPA: " + gradePointAverage + ", Grade: " + grade;
    }
}
