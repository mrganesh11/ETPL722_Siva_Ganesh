package com.evergent.corejava.studentapplication4;
import java.util.Scanner;

public class MainController {

    public static void main(String[] args) {
        int studentId = 0;
        String name = "";
        float gradePointAverage = 0;

        Scanner sin = new Scanner(System.in);

        System.out.println("Enter Student ID:");
        studentId = sin.nextInt();
        System.out.println("Enter Student Name:");
        name = sin.next();
        System.out.println("Enter Student GPA:");
        gradePointAverage = sin.nextFloat();

        StudentService studentService = new StudentService();
        int updateCount = studentService.addStudentService(studentId, name, gradePointAverage);

        System.out.println("Inserted: " + updateCount + " record(s) successfully.");
    }
}
